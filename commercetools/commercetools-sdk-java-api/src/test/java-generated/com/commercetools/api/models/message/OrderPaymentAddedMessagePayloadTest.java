
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPaymentAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPaymentAddedMessagePayloadBuilder builder) {
        OrderPaymentAddedMessagePayload orderPaymentAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentAddedMessagePayload).isInstanceOf(OrderPaymentAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentRef", OrderPaymentAddedMessagePayload.builder()
                .paymentRef(new com.commercetools.api.models.payment.PaymentReferenceImpl()) } };
    }

    @Test
    public void paymentRef() {
        OrderPaymentAddedMessagePayload value = OrderPaymentAddedMessagePayload.of();
        value.setPaymentRef(new com.commercetools.api.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPaymentRef())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentReferenceImpl());
    }
}
