
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderVerificationStartedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderVerificationStartedBuilder builder) {
        OrderVerificationStarted orderVerificationStarted = builder.buildUnchecked();
        Assertions.assertThat(orderVerificationStarted).isInstanceOf(OrderVerificationStarted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", OrderVerificationStarted.builder().severity("severity") },
                new Object[] { "message", OrderVerificationStarted.builder().message("message") },
                new Object[] { "correlationId", OrderVerificationStarted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        OrderVerificationStarted value = OrderVerificationStarted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        OrderVerificationStarted value = OrderVerificationStarted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        OrderVerificationStarted value = OrderVerificationStarted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
