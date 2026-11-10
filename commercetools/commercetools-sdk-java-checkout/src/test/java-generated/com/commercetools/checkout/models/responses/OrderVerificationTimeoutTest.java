
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderVerificationTimeoutTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderVerificationTimeoutBuilder builder) {
        OrderVerificationTimeout orderVerificationTimeout = builder.buildUnchecked();
        Assertions.assertThat(orderVerificationTimeout).isInstanceOf(OrderVerificationTimeout.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", OrderVerificationTimeout.builder().severity("severity") },
                new Object[] { "message", OrderVerificationTimeout.builder().message("message") },
                new Object[] { "correlationId", OrderVerificationTimeout.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        OrderVerificationTimeout value = OrderVerificationTimeout.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        OrderVerificationTimeout value = OrderVerificationTimeout.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        OrderVerificationTimeout value = OrderVerificationTimeout.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
