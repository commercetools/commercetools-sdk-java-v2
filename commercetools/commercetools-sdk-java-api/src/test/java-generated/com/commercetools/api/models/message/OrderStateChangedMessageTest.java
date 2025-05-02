
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderStateChangedMessageBuilder builder) {
        OrderStateChangedMessage orderStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderStateChangedMessage).isInstanceOf(OrderStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "orderState",
                        OrderStateChangedMessage.builder()
                                .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) },
                new Object[] { "oldOrderState", OrderStateChangedMessage.builder()
                        .oldOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) } };
    }

    @Test
    public void orderState() {
        OrderStateChangedMessage value = OrderStateChangedMessage.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }

    @Test
    public void oldOrderState() {
        OrderStateChangedMessage value = OrderStateChangedMessage.of();
        value.setOldOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOldOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }
}
