
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentCancelledTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentCancelledBuilder builder) {
        PaymentCancelled paymentCancelled = builder.buildUnchecked();
        Assertions.assertThat(paymentCancelled).isInstanceOf(PaymentCancelled.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentCancelled.builder().severity("severity") },
                new Object[] { "message", PaymentCancelled.builder().message("message") },
                new Object[] { "correlationId", PaymentCancelled.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentCancelled.builder()
                        .payload(new com.commercetools.checkout.models.payment.PaymentReferenceImpl()) } };
    }

    @Test
    public void severity() {
        PaymentCancelled value = PaymentCancelled.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentCancelled value = PaymentCancelled.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentCancelled value = PaymentCancelled.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentCancelled value = PaymentCancelled.of();
        value.setPayload(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPayload())
                .isEqualTo(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
    }
}
