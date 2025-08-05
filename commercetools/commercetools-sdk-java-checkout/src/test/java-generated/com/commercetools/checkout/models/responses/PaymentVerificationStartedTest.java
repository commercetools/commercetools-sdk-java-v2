
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentVerificationStartedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentVerificationStartedBuilder builder) {
        PaymentVerificationStarted paymentVerificationStarted = builder.buildUnchecked();
        Assertions.assertThat(paymentVerificationStarted).isInstanceOf(PaymentVerificationStarted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentVerificationStarted.builder().severity("severity") },
                new Object[] { "message", PaymentVerificationStarted.builder().message("message") },
                new Object[] { "correlationId", PaymentVerificationStarted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        PaymentVerificationStarted value = PaymentVerificationStarted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentVerificationStarted value = PaymentVerificationStarted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentVerificationStarted value = PaymentVerificationStarted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
