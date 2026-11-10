
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderChangeShipmentStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderChangeShipmentStateActionBuilder builder) {
        OrderChangeShipmentStateAction orderChangeShipmentStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderChangeShipmentStateAction).isInstanceOf(OrderChangeShipmentStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shipmentState", OrderChangeShipmentStateAction.builder()
                .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) } };
    }

    @Test
    public void shipmentState() {
        OrderChangeShipmentStateAction value = OrderChangeShipmentStateAction.of();
        value.setShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }
}
