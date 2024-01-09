
package commercetools.utils;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

import java.time.Duration;
import java.util.*;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringImpl;

import io.vrap.rmf.base.client.http.ErrorMiddleware;

public class CommercetoolsTestUtils {

    private static final ProjectApiRoot projectApiRoot;

    static {
        ApiRootBuilder builder = ApiRootBuilder.ofEnvironmentVariables()
                .addConcurrentModificationMiddleware()
                .withPolicies(
                    policyBuilder -> policyBuilder.withRetry(b -> b.maxRetries(5).statusCodes(singletonList(503))))
                .withErrorMiddleware(ErrorMiddleware.ExceptionMode.UNWRAP_COMPLETION_EXCEPTION);
        projectApiRoot = builder.buildProjectRoot();
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
                    throw new AssertionError(
                        String.format("assertEventually timed out after %s seconds", maxWaitTime.getSeconds()), e);
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
