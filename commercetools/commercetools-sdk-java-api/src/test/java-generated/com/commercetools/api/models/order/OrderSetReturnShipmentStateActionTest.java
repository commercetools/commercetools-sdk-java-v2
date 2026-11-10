
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetReturnShipmentStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetReturnShipmentStateActionBuilder builder) {
        OrderSetReturnShipmentStateAction orderSetReturnShipmentStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnShipmentStateAction).isInstanceOf(OrderSetReturnShipmentStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        OrderSetReturnShipmentStateAction.builder().returnItemId("returnItemId") },
                new Object[] { "returnItemKey",
                        OrderSetReturnShipmentStateAction.builder().returnItemKey("returnItemKey") },
                new Object[] { "shipmentState", OrderSetReturnShipmentStateAction.builder()
                        .shipmentState(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised")) } };
    }

    @Test
    public void returnItemId() {
        OrderSetReturnShipmentStateAction value = OrderSetReturnShipmentStateAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        OrderSetReturnShipmentStateAction value = OrderSetReturnShipmentStateAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void shipmentState() {
        OrderSetReturnShipmentStateAction value = OrderSetReturnShipmentStateAction.of();
        value.setShipmentState(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised"));
    }
}
