
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderChangeOrderStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderChangeOrderStateActionBuilder builder) {
        OrderChangeOrderStateAction orderChangeOrderStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderChangeOrderStateAction).isInstanceOf(OrderChangeOrderStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "orderState", OrderChangeOrderStateAction.builder()
                .orderState(com.commercetools.api.models.order.OrderState.findEnum("Open")) } };
    }

    @Test
    public void orderState() {
        OrderChangeOrderStateAction value = OrderChangeOrderStateAction.of();
        value.setOrderState(com.commercetools.api.models.order.OrderState.findEnum("Open"));
        Assertions.assertThat(value.getOrderState())
                .isEqualTo(com.commercetools.api.models.order.OrderState.findEnum("Open"));
    }
}
