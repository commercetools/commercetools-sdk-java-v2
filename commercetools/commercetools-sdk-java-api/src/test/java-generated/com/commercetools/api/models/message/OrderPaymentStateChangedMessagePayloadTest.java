
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPaymentStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPaymentStateChangedMessagePayloadBuilder builder) {
        OrderPaymentStateChangedMessagePayload orderPaymentStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentStateChangedMessagePayload)
                .isInstanceOf(OrderPaymentStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentState",
                        OrderPaymentStateChangedMessagePayload.builder()
                                .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) },
                new Object[] { "oldPaymentState", OrderPaymentStateChangedMessagePayload.builder()
                        .oldPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) } };
    }

    @Test
    public void paymentState() {
        OrderPaymentStateChangedMessagePayload value = OrderPaymentStateChangedMessagePayload.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void oldPaymentState() {
        OrderPaymentStateChangedMessagePayload value = OrderPaymentStateChangedMessagePayload.of();
        value.setOldPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getOldPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }
}
