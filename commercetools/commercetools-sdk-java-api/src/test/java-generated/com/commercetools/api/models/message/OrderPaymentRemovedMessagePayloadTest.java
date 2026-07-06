
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPaymentRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPaymentRemovedMessagePayloadBuilder builder) {
        OrderPaymentRemovedMessagePayload orderPaymentRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentRemovedMessagePayload).isInstanceOf(OrderPaymentRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentRef",
                        OrderPaymentRemovedMessagePayload.builder()
                                .paymentRef(new com.commercetools.api.models.payment.PaymentReferenceImpl()) },
                new Object[] { "removedPaymentInfo",
                        OrderPaymentRemovedMessagePayload.builder().removedPaymentInfo(true) } };
    }

    @Test
    public void paymentRef() {
        OrderPaymentRemovedMessagePayload value = OrderPaymentRemovedMessagePayload.of();
        value.setPaymentRef(new com.commercetools.api.models.payment.PaymentReferenceImpl());
        Assertions.assertThat(value.getPaymentRef())
                .isEqualTo(new com.commercetools.api.models.payment.PaymentReferenceImpl());
    }

    @Test
    public void removedPaymentInfo() {
        OrderPaymentRemovedMessagePayload value = OrderPaymentRemovedMessagePayload.of();
        value.setRemovedPaymentInfo(true);
        Assertions.assertThat(value.getRemovedPaymentInfo()).isEqualTo(true);
    }
}
