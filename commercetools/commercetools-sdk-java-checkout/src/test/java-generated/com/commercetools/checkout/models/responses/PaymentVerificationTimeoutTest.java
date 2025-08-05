
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentVerificationTimeoutTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentVerificationTimeoutBuilder builder) {
        PaymentVerificationTimeout paymentVerificationTimeout = builder.buildUnchecked();
        Assertions.assertThat(paymentVerificationTimeout).isInstanceOf(PaymentVerificationTimeout.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentVerificationTimeout.builder().severity("severity") },
                new Object[] { "message", PaymentVerificationTimeout.builder().message("message") },
                new Object[] { "correlationId", PaymentVerificationTimeout.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        PaymentVerificationTimeout value = PaymentVerificationTimeout.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentVerificationTimeout value = PaymentVerificationTimeout.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentVerificationTimeout value = PaymentVerificationTimeout.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
