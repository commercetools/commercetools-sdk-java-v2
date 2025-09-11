
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentValidationFailedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentValidationFailedBuilder builder) {
        PaymentValidationFailed paymentValidationFailed = builder.buildUnchecked();
        Assertions.assertThat(paymentValidationFailed).isInstanceOf(PaymentValidationFailed.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentValidationFailed.builder().severity("severity") },
                new Object[] { "message", PaymentValidationFailed.builder().message("message") },
                new Object[] { "correlationId", PaymentValidationFailed.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentValidationFailed.builder()
                        .payload(new com.commercetools.checkout.models.payment.PaymentReferenceImpl()) } };
    }

    @Test
    public void severity() {
        PaymentValidationFailed value = PaymentValidationFailed.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentValidationFailed value = PaymentValidationFailed.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentValidationFailed value = PaymentValidationFailed.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentValidationFailed value = PaymentValidationFailed.of();
        value.setPayload(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPayload())
                .isEqualTo(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
    }
}
