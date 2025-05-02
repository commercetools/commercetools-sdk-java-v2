
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentCreatedMessagePayloadBuilder builder) {
        PaymentCreatedMessagePayload paymentCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentCreatedMessagePayload).isInstanceOf(PaymentCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payment", PaymentCreatedMessagePayload.builder()
                .payment(new com.commercetools.api.models.payment.PaymentImpl()) } };
    }

    @Test
    public void payment() {
        PaymentCreatedMessagePayload value = PaymentCreatedMessagePayload.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentImpl());
        Assertions.assertThat(value.getPayment()).isEqualTo(new com.commercetools.api.models.payment.PaymentImpl());
    }
}
