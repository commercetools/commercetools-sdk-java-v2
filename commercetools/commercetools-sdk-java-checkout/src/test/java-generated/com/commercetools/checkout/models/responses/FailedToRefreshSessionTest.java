
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FailedToRefreshSessionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, FailedToRefreshSessionBuilder builder) {
        FailedToRefreshSession failedToRefreshSession = builder.buildUnchecked();
        Assertions.assertThat(failedToRefreshSession).isInstanceOf(FailedToRefreshSession.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", FailedToRefreshSession.builder().severity("severity") },
                new Object[] { "message", FailedToRefreshSession.builder().message("message") },
                new Object[] { "correlationId", FailedToRefreshSession.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        FailedToRefreshSession value = FailedToRefreshSession.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        FailedToRefreshSession value = FailedToRefreshSession.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        FailedToRefreshSession value = FailedToRefreshSession.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
