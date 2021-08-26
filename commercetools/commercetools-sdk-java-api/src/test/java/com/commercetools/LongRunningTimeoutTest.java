
package com.commercetools;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.*;

import okhttp3.*;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.message.MessagePagedQueryResponse;
import com.commercetools.http.apachehttp.CtApacheHttpClient;
import com.commercetools.http.okhttp4.CtOkHttp4Client;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.ClientBuilder;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class LongRunningTimeoutTest {

    /**
     * This is a test to check long running multiple calls to the API
     * to check for timeout exceptions
     * @param args unused command line parameters
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        final TokenSupplier tokenSupplier = new ClientCredentialsTokenSupplier(getClientId(), getClientSecret(), null,
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), new CtOkHttp4Client());
        final AuthenticationToken token = tokenSupplier.getToken().get();
        final ApiRoot client = ApiRoot.fromClient(ClientBuilder.of(new CtApacheHttpClient())
                //                .of(new CtOkHttp4Client(builder -> builder.protocols(Arrays.asList(Protocol.HTTP_2, Protocol.HTTP_1_1)).connectTimeout(300, TimeUnit.MILLISECONDS).readTimeout(1000, TimeUnit.MILLISECONDS).retryOnConnectionFailure(true).connectionPool(new ConnectionPool(0, 1, TimeUnit.NANOSECONDS))))

                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withClientCredentialsFlow(
                    ClientCredentials.of().withClientSecret(getClientSecret()).withClientId(getClientId()).build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl())
                .build());

        final ApiHttpResponse<MessagePagedQueryResponse> future = client.withProjectKey(getProjectKey())
                .messages()
                .get()
                .executeBlocking();

        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        s.scheduleWithFixedDelay(LongRunningTimeoutTest::printGCStats, 1, 1, TimeUnit.SECONDS);

        final int elements = 100000;
        BlockingQueue<Pair<String, Integer>> blockingQueue = new ArrayBlockingQueue<>(50000);

        final int concurrency = 20;
        ExecutorService threadPool = Executors.newFixedThreadPool(concurrency);

        Random r = new Random();

        ScheduledExecutorService producer = Executors.newSingleThreadScheduledExecutor();

        producer.execute(() -> {
            for (int i = 0; i < elements; ++i) {
                try {
                    blockingQueue.put(new ImmutablePair<>(
                        future.getBody().getResults().get(r.nextInt(future.getBody().getCount().intValue())).getId(),
                        i));
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.shutdown();

        final Dispatcher dispatcher = new Dispatcher(Executors.newScheduledThreadPool(10));
        dispatcher.setMaxRequests(64);
        dispatcher.setMaxRequestsPerHost(64);

        final OkHttpClient client2 = new OkHttpClient.Builder().dispatcher(dispatcher)
                //                .protocols(Lists.list(Protocol.HTTP_1_1))
                .build();
        for (int i = 0; i < concurrency; i++) {
            threadPool.execute(() -> {
                try {
                    while (!threadPool.isTerminated()) {
                        Pair<String, Integer> p = blockingQueue.poll(1, TimeUnit.SECONDS);
                        if (p == null) {
                            break;
                        }
                        //                        final Request request = new Request.Builder()
                        //                                .addHeader("Authorization", "Bearer " + token.getAccessToken())
                        //                                .addHeader("Content-Type", "application/json")
                        //                                .url(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl() + "/" + getProjectKey() + "/messages/"
                        //                                        + p.getLeft())
                        //                                .build();
                        //                        try (Response response = client2.newCall(request).execute()) {
                        //                            String b = response.body().string();
                        //                            response.close();
                        //                            System.out.println(b);
                        //                            System.out.println(p.getRight());
                        //                            System.out.println(client2.dispatcher().runningCallsCount());
                        //                        }

                        final ApiHttpResponse<byte[]> messageApiHttpResponse = client.withProjectKey(getProjectKey())
                                .messages()
                                .withId(p.getLeft())
                                .get()
                                .sendBlocking(Duration.ofMillis(10000));
                    }
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        threadPool.shutdown();
        // Wait until all threads are finish
        while (!threadPool.isTerminated()) {
            Thread.sleep(400);
        }
        System.out.println("\nFinished all threads");
        client.close();
        client2.connectionPool().evictAll();
        client2.dispatcher().executorService().shutdownNow();
        if (client2.cache() != null)
            Objects.requireNonNull(client2.cache()).close();
        s.shutdownNow();

    }

    public static void printGCStats() {
        long totalGarbageCollections = 0;
        long garbageCollectionTime = 0;

        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {

            long count = gc.getCollectionCount();

            if (count >= 0) {
                totalGarbageCollections += count;
            }

            long time = gc.getCollectionTime();

            if (time >= 0) {
                garbageCollectionTime += time;
            }
        }

        System.out.println("Total Garbage Collections: " + totalGarbageCollections);
        System.out.println("Total Garbage Collection Time (ms): " + garbageCollectionTime);
        Runtime runtime = Runtime.getRuntime();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
    }

    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static String getProjectKey() {
        return System.getenv("CTP_PROJECT_KEY");
    }

    public static String getClientId() {
        return System.getenv("CTP_CLIENT_ID");
    }

    public static String getClientSecret() {
        return System.getenv("CTP_CLIENT_SECRET");
    }

    public static String getScopes() {
        return "manage_project:" + getProjectKey() + " manage_api_clients:" + getProjectKey();
    }
}
