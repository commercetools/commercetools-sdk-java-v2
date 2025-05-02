
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderRemoveDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderRemoveDeliveryActionBuilder builder) {
        OrderRemoveDeliveryAction orderRemoveDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderRemoveDeliveryAction).isInstanceOf(OrderRemoveDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", OrderRemoveDeliveryAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey", OrderRemoveDeliveryAction.builder().deliveryKey("deliveryKey") } };
    }

    @Test
    public void deliveryId() {
        OrderRemoveDeliveryAction value = OrderRemoveDeliveryAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderRemoveDeliveryAction value = OrderRemoveDeliveryAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }
}
