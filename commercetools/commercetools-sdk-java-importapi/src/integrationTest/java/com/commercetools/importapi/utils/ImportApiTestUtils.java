
package com.commercetools.importapi.utils;

import java.time.Duration;
import java.util.UUID;
import java.util.function.Consumer;

import com.commercetools.importapi.client.ProjectApiRoot;
import com.commercetools.importapi.defaultconfig.ImportApiRootBuilder;
import com.commercetools.importapi.defaultconfig.ServiceRegion;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.common.LocalizedStringImpl;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.api.SoftAssertions;

public class ImportApiTestUtils {

    private static final ProjectApiRoot projectRoot;

    static {
        String logLevel = System.getenv("CTP_JVM_SDK_LOG_LEVEL");
        if ("OFF".equals(logLevel)) {
            projectRoot = ImportApiRootBuilder.of()
                    .defaultClient(
                        ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                        ServiceRegion.GCP_EUROPE_WEST1)
                    .build(getProjectKey());
        }
        else {
            projectRoot = ImportApiRootBuilder.of()
                    .defaultClient(
                        ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                        ServiceRegion.GCP_EUROPE_WEST1)
                    .build(getProjectKey());
        }
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

    public static ProjectApiRoot getProjectRoot() {
        return projectRoot;
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

    public static void assertEventually(final Consumer<SoftAssertions> assertionsConsumer) {
        final Runnable block = () -> {
            final SoftAssertions softly = new SoftAssertions();
            assertionsConsumer.accept(softly);
            softly.assertAll();
        };
        assertEventually(block);
    }

    public static void assertEventually(final Runnable block) {
        final Boolean useLongTimeout = "true".equals(System.getenv("TRAVIS"))
                || StringUtils.isNotEmpty(System.getenv("TEAMCITY_VERSION"))
                || StringUtils.isNoneEmpty(System.getenv("GITHUB_WORKSPACE"));
        final Duration maxWaitTime = Duration.ofSeconds(useLongTimeout ? 60 : 30);
        final Duration waitBeforeRetry = Duration.ofMillis(100);
        assertEventually(maxWaitTime, waitBeforeRetry, block);
    }
}
