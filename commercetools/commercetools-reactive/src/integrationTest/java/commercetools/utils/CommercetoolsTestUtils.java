
package commercetools.utils;

import static java.util.Arrays.asList;

import java.time.Duration;
import java.util.*;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.error.ApiHttpExceptionFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringImpl;
import com.commercetools.http.netty.CtNettyHttpClient;
import com.commercetools.http.netty.CtNettyReactiveHttpClient;
import com.commercetools.http.reactive.*;

import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.http.OAuthHandler;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.base.client.oauth2.InMemoryTokenSupplier;

public class CommercetoolsTestUtils {

    private static final ProjectApiRoot projectApiRoot;
    private static final ApiHttpClient client;

    static {
        projectApiRoot = ProjectApiRoot.of(getProjectKey());
        client = buildClient();
    }

    private static ApiHttpClient buildClient() {
        ResponseSerializer serializer = ResponseSerializer.of();
        ClientCredentials credentials = ClientCredentials.of()
                .withClientId(getClientId())
                .withClientSecret(getClientSecret())
                .build();
        return ApiHttpClient.of(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
            HandlerStack.create(HttpHandler.create(new CtNettyReactiveHttpClient()),
                Arrays.asList(
                    OAuthMiddleware.of(new OAuthHandler(new InMemoryTokenSupplier(
                        new ClientCredentialsTokenSupplier(credentials.getClientId(), credentials.getClientSecret(),
                            null, ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), new CtNettyHttpClient())))),
                    ErrorMiddleware.of(ApiHttpExceptionFactory.of(serializer)))),
            serializer);
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

    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> Set<T> asSet(final T... params) {
        return new LinkedHashSet<>(asList(params));
    }

    public static LocalizedString randomSlug() {
        return LocalizedString.of(Locale.ENGLISH, CommercetoolsTestUtils.randomKey());
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

    public static ApiHttpClient getClient() {
        return client;
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
