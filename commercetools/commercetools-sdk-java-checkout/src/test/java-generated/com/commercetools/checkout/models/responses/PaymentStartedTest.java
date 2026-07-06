
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentStartedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentStartedBuilder builder) {
        PaymentStarted paymentStarted = builder.buildUnchecked();
        Assertions.assertThat(paymentStarted).isInstanceOf(PaymentStarted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentStarted.builder().severity("severity") },
                new Object[] { "message", PaymentStarted.builder().message("message") },
                new Object[] { "correlationId", PaymentStarted.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentStarted.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentStarted value = PaymentStarted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentStarted value = PaymentStarted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentStarted value = PaymentStarted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentStarted value = PaymentStarted.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
