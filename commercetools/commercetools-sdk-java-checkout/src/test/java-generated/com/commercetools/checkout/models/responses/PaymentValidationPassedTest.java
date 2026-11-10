
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentValidationPassedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentValidationPassedBuilder builder) {
        PaymentValidationPassed paymentValidationPassed = builder.buildUnchecked();
        Assertions.assertThat(paymentValidationPassed).isInstanceOf(PaymentValidationPassed.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentValidationPassed.builder().severity("severity") },
                new Object[] { "message", PaymentValidationPassed.builder().message("message") },
                new Object[] { "correlationId", PaymentValidationPassed.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        PaymentValidationPassed value = PaymentValidationPassed.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentValidationPassed value = PaymentValidationPassed.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentValidationPassed value = PaymentValidationPassed.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
