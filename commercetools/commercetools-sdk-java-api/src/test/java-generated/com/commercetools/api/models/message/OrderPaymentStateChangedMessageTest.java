
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPaymentStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPaymentStateChangedMessageBuilder builder) {
        OrderPaymentStateChangedMessage orderPaymentStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderPaymentStateChangedMessage).isInstanceOf(OrderPaymentStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentState",
                        OrderPaymentStateChangedMessage.builder()
                                .paymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) },
                new Object[] { "oldPaymentState", OrderPaymentStateChangedMessage.builder()
                        .oldPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue")) } };
    }

    @Test
    public void paymentState() {
        OrderPaymentStateChangedMessage value = OrderPaymentStateChangedMessage.of();
        value.setPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void oldPaymentState() {
        OrderPaymentStateChangedMessage value = OrderPaymentStateChangedMessage.of();
        value.setOldPaymentState(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getOldPaymentState())
                .isEqualTo(com.commercetools.api.models.order.PaymentState.findEnum("BalanceDue"));
    }
}
