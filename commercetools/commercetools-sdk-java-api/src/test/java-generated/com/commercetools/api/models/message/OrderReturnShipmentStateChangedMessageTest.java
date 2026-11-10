
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderReturnShipmentStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderReturnShipmentStateChangedMessageBuilder builder) {
        OrderReturnShipmentStateChangedMessage orderReturnShipmentStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderReturnShipmentStateChangedMessage)
                .isInstanceOf(OrderReturnShipmentStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        OrderReturnShipmentStateChangedMessage.builder().returnItemId("returnItemId") },
                new Object[] { "returnShipmentState",
                        OrderReturnShipmentStateChangedMessage.builder()
                                .returnShipmentState(
                                    com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised")) } };
    }

    @Test
    public void returnItemId() {
        OrderReturnShipmentStateChangedMessage value = OrderReturnShipmentStateChangedMessage.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnShipmentState() {
        OrderReturnShipmentStateChangedMessage value = OrderReturnShipmentStateChangedMessage.of();
        value.setReturnShipmentState(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getReturnShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised"));
    }
}
