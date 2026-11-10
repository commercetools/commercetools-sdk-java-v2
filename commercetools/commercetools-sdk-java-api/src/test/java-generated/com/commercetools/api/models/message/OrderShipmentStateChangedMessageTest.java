
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderShipmentStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderShipmentStateChangedMessageBuilder builder) {
        OrderShipmentStateChangedMessage orderShipmentStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderShipmentStateChangedMessage).isInstanceOf(OrderShipmentStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shipmentState",
                        OrderShipmentStateChangedMessage.builder()
                                .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) },
                new Object[] { "oldShipmentState", OrderShipmentStateChangedMessage.builder()
                        .oldShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) } };
    }

    @Test
    public void shipmentState() {
        OrderShipmentStateChangedMessage value = OrderShipmentStateChangedMessage.of();
        value.setShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void oldShipmentState() {
        OrderShipmentStateChangedMessage value = OrderShipmentStateChangedMessage.of();
        value.setOldShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getOldShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }
}
