
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderReturnShipmentStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderReturnShipmentStateChangedMessagePayloadBuilder builder) {
        OrderReturnShipmentStateChangedMessagePayload orderReturnShipmentStateChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(orderReturnShipmentStateChangedMessagePayload)
                .isInstanceOf(OrderReturnShipmentStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        OrderReturnShipmentStateChangedMessagePayload.builder().returnItemId("returnItemId") },
                new Object[] { "returnShipmentState",
                        OrderReturnShipmentStateChangedMessagePayload.builder()
                                .returnShipmentState(
                                    com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised")) } };
    }

    @Test
    public void returnItemId() {
        OrderReturnShipmentStateChangedMessagePayload value = OrderReturnShipmentStateChangedMessagePayload.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnShipmentState() {
        OrderReturnShipmentStateChangedMessagePayload value = OrderReturnShipmentStateChangedMessagePayload.of();
        value.setReturnShipmentState(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getReturnShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised"));
    }
}
