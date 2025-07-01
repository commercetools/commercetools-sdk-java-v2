
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCreatedMessagePayloadBuilder builder) {
        PaymentMethodCreatedMessagePayload paymentMethodCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodCreatedMessagePayload)
                .isInstanceOf(PaymentMethodCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentMethod", PaymentMethodCreatedMessagePayload.builder()
                .paymentMethod(new com.commercetools.api.models.payment_method.PaymentMethodImpl()) } };
    }

    @Test
    public void paymentMethod() {
        PaymentMethodCreatedMessagePayload value = PaymentMethodCreatedMessagePayload.of();
        value.setPaymentMethod(new com.commercetools.api.models.payment_method.PaymentMethodImpl());
        Assertions.assertThat(value.getPaymentMethod())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodImpl());
    }
}
