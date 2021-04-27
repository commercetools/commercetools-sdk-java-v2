
package com.commercetools;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.message.MessagePagedQueryResponse;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductPagedQueryResponse;
import com.commercetools.api.models.project.Project;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class LongRunningTimeoutTest {

    /**
     * This is a test if no threads are blocking the the termination of the application. Needs to be executed on the ci server.
     * In case it has a leak, it just hangs.
     * This is necessary, since a unit test cannot cover this termination problem.
     * @param args unused command line parameters
     */
    public static void main(String[] args)
            throws InterruptedException, ExecutionException, TimeoutException, IOException {
        final ApiRoot client = ApiFactory.create(
            ClientCredentials.of()
                    .withClientId(getClientId())
                    .withClientSecret(getClientSecret())
                    .withScopes(getScopes())
                    .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());

        final ApiHttpResponse<MessagePagedQueryResponse> future = client.withProjectKey(getProjectKey())
                .messages().get().executeBlocking();

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        Random r = new Random();
        for (int n =0; n < 1000; n++) {
            for (int i = 0; i < 50; i++) {
                threadPool.execute(() -> {
                    client.withProjectKey(getProjectKey())
                            .messages()
                            .withId(future.getBody()
                                    .getResults()
                                    .get(r.nextInt(future.getBody().getCount().intValue()))
                                    .getId())
                            .get()
                            .executeBlocking(Duration.ofSeconds(1));
//                    try {
//                        Thread.sleep(5);
//                    }
//                    catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                });
            }
//            Thread.sleep(5);
        }
        threadPool.shutdown();
        // Wait until all threads are finish
        while (!threadPool.isTerminated()) {
            Thread.sleep(400);
        }
        System.out.println("\nFinished all threads");
        client.close();
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
