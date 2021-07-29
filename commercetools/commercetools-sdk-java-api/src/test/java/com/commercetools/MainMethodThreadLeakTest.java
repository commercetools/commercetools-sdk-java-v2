
package com.commercetools;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.project.Project;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class MainMethodThreadLeakTest {

    /**
     * This is a test if no threads are blocking the the termination of the application. Needs to be executed on the ci server.
     * In case it has a leak, it just hangs.
     * This is necessary, since a unit test cannot cover this termination problem.
     * @param args unused command line parameters
     */
    public static void main(String[] args)
            throws InterruptedException, ExecutionException, TimeoutException, IOException {
        final ApiRoot client = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of()
                            .withClientId(getClientId())
                            .withClientSecret(getClientSecret())
                            .withScopes(getScopes())
                            .build(),
                    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .build();
        final CompletableFuture<ApiHttpResponse<Project>> future = client.withProjectKey(getProjectKey())
                .get()
                .execute();
        try {
            future.get(10, TimeUnit.SECONDS);
        }
        finally {
            client.close();
        }
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
