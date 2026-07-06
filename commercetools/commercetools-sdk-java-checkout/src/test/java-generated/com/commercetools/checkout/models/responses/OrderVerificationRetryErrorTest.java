
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderVerificationRetryErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderVerificationRetryErrorBuilder builder) {
        OrderVerificationRetryError orderVerificationRetryError = builder.buildUnchecked();
        Assertions.assertThat(orderVerificationRetryError).isInstanceOf(OrderVerificationRetryError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", OrderVerificationRetryError.builder().severity("severity") },
                new Object[] { "message", OrderVerificationRetryError.builder().message("message") },
                new Object[] { "correlationId", OrderVerificationRetryError.builder().correlationId("correlationId") },
                new Object[] { "payload", OrderVerificationRetryError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        OrderVerificationRetryError value = OrderVerificationRetryError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        OrderVerificationRetryError value = OrderVerificationRetryError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        OrderVerificationRetryError value = OrderVerificationRetryError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        OrderVerificationRetryError value = OrderVerificationRetryError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
