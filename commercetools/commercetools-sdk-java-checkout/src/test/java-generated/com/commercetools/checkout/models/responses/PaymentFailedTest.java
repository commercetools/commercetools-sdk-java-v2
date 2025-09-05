
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentFailedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentFailedBuilder builder) {
        PaymentFailed paymentFailed = builder.buildUnchecked();
        Assertions.assertThat(paymentFailed).isInstanceOf(PaymentFailed.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentFailed.builder().severity("severity") },
                new Object[] { "message", PaymentFailed.builder().message("message") },
                new Object[] { "correlationId", PaymentFailed.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentFailed.builder()
                        .payload(new com.commercetools.checkout.models.payment.PaymentReferenceImpl()) } };
    }

    @Test
    public void severity() {
        PaymentFailed value = PaymentFailed.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentFailed value = PaymentFailed.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentFailed value = PaymentFailed.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentFailed value = PaymentFailed.of();
        value.setPayload(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPayload())
                .isEqualTo(new com.commercetools.checkout.models.payment.PaymentReferenceImpl());
    }
}
