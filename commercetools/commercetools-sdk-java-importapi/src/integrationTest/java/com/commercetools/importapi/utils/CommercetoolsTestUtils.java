
package com.commercetools.importapi.utils;

import java.time.Duration;
import java.util.UUID;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringImpl;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class CommercetoolsTestUtils {

    private static final ProjectApiRoot projectApiRoot;

    static {
        ServiceRegion region = System.getenv("CTP_REGION") == null ? ServiceRegion.GCP_EUROPE_WEST1
                : ServiceRegion.valueOf(System.getenv("CTP_REGION"));
        String authURL = System.getenv("CTP_AUTH_URL") == null ? region.getOAuthTokenUrl()
                : System.getenv("CTP_AUTH_URL");
        String apiUrl = System.getenv("CTP_API_URL") == null ? region.getApiUrl() : System.getenv("CTP_API_URL");
        String logLevel = System.getenv("CTP_JVM_SDK_LOG_LEVEL");
        ApiRootBuilder builder = ApiRootBuilder.of()
                .defaultClient(
                    ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                    authURL, apiUrl);
        projectApiRoot = builder.build(getProjectKey());
    }

    public static String randomString() {
        return "random-string-" + UUID.randomUUID().toString();
    }

    public static String randomId() {
        return "random-id-" + UUID.randomUUID().toString();
    }

    public static String randomKey() {
        return "random-key-" + UUID.randomUUID().toString();
    }

    public static LocalizedString randomLocalizedString() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue(randomString(), randomString());
        return localizedString;
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

    public static ProjectApiRoot getProjectApiRoot() {
        return projectApiRoot;
    }

    public static void assertEventually(final Duration maxWaitTime, final Duration waitBeforeRetry,
            final Runnable block) {
        final long timeOutAt = System.currentTimeMillis() + maxWaitTime.toMillis();
        while (true) {
            try {
                block.run();

                // the block executed without throwing an exception, return
                return;
            }
            catch (AssertionError e) {
                if (System.currentTimeMillis() > timeOutAt) {
                    throw e;
                }
            }

            try {
                Thread.sleep(waitBeforeRetry.toMillis());
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
