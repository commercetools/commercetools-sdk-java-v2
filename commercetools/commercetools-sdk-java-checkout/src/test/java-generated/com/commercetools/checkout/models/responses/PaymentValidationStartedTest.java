
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentValidationStartedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentValidationStartedBuilder builder) {
        PaymentValidationStarted paymentValidationStarted = builder.buildUnchecked();
        Assertions.assertThat(paymentValidationStarted).isInstanceOf(PaymentValidationStarted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentValidationStarted.builder().severity("severity") },
                new Object[] { "message", PaymentValidationStarted.builder().message("message") },
                new Object[] { "correlationId", PaymentValidationStarted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        PaymentValidationStarted value = PaymentValidationStarted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentValidationStarted value = PaymentValidationStarted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentValidationStarted value = PaymentValidationStarted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
