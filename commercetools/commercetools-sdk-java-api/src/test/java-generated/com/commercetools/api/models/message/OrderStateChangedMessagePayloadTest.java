
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderStateChangedMessagePayloadBuilder builder) {
        OrderStateChangedMessagePayload orderStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderStateChangedMessagePayload).isInstanceOf(OrderStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "orderState",
                        OrderStateChangedMessagePayload.builder()
                                .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) },
                new Object[] { "oldOrderState", OrderStateChangedMessagePayload.builder()
                        .oldOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) } };
    }

    @Test
    public void orderState() {
        OrderStateChangedMessagePayload value = OrderStateChangedMessagePayload.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }

    @Test
    public void oldOrderState() {
        OrderStateChangedMessagePayload value = OrderStateChangedMessagePayload.of();
        value.setOldOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOldOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }
}
