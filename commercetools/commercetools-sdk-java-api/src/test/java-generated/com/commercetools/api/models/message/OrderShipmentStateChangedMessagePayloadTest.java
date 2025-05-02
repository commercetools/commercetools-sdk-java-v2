
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderShipmentStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderShipmentStateChangedMessagePayloadBuilder builder) {
        OrderShipmentStateChangedMessagePayload orderShipmentStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderShipmentStateChangedMessagePayload)
                .isInstanceOf(OrderShipmentStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shipmentState",
                        OrderShipmentStateChangedMessagePayload.builder()
                                .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) },
                new Object[] { "oldShipmentState", OrderShipmentStateChangedMessagePayload.builder()
                        .oldShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) } };
    }

    @Test
    public void shipmentState() {
        OrderShipmentStateChangedMessagePayload value = OrderShipmentStateChangedMessagePayload.of();
        value.setShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }

    @Test
    public void oldShipmentState() {
        OrderShipmentStateChangedMessagePayload value = OrderShipmentStateChangedMessagePayload.of();
        value.setOldShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getOldShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }
}
