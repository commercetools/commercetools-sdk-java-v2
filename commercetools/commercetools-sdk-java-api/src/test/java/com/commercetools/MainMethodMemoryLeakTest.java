
package com.commercetools;

import java.time.Duration;
import java.util.concurrent.*;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.project.Project;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import dev.failsafe.Bulkhead;

public class MainMethodMemoryLeakTest {

    /**
     * This is a test if no threads are blocking the the termination of the application. Needs to be executed on the ci server.
     * In case it has a leak, it just hangs.
     * This is necessary, since a unit test cannot cover this termination problem.
     * @param args unused command line parameters
     */
    public static void main(String[] args) throws InterruptedException {
        long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        ApiRoot client = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .build();
        Bulkhead<Object> bulkhead = Bulkhead.builder(30).build();
        int requests = 20000;
        ConcurrentHashMap<Integer, String> projectKeys = new ConcurrentHashMap<>(requests);
        ConcurrentHashMap<Integer, Long> maxMem = new ConcurrentHashMap<>(requests);
        ExecutorService executorService = Executors.newScheduledThreadPool(10);
        for (int i = 0; i < requests; i++) {
            final int finalI = i;
            if (bulkhead.tryAcquirePermit(Duration.ofSeconds(60))) {
                executorService.submit(() -> {
                    try {
                        projectKeys.put(finalI,
                            client.withProjectKey(getProjectKey())
                                    .get()
                                    .execute()
                                    .thenApply(ApiHttpResponse::getBody)
                                    .thenApply(Project::getKey)
                                    .get(10, TimeUnit.SECONDS));
                    }
                    catch (InterruptedException | ExecutionException | TimeoutException e) {
                        throw new RuntimeException(e);
                    }
                    finally {
                        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                        long actualMemUsed = afterUsedMem - beforeUsedMem;
                        maxMem.put(finalI, actualMemUsed);
                        System.out.printf("memory used: %s%n", actualMemUsed);
                        bulkhead.releasePermit();
                    }
                });
            }
        }
        executorService.shutdown();
        executorService.awaitTermination(20, TimeUnit.SECONDS);

        long maxUsedMem = maxMem.values().stream().reduce(Math::max).get();
        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long actualMemUsed = afterUsedMem - beforeUsedMem;
        System.out.printf("Project Key size: %s%n", projectKeys.size());
        System.out.printf("memory used: %s%n", actualMemUsed);
        System.out.printf("max memory used: %s%n", maxUsedMem);
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
}
