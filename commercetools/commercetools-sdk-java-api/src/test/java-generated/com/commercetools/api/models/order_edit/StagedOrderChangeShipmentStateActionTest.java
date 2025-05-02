
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderChangeShipmentStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderChangeShipmentStateActionBuilder builder) {
        StagedOrderChangeShipmentStateAction stagedOrderChangeShipmentStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderChangeShipmentStateAction)
                .isInstanceOf(StagedOrderChangeShipmentStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shipmentState", StagedOrderChangeShipmentStateAction.builder()
                .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) } };
    }

    @Test
    public void shipmentState() {
        StagedOrderChangeShipmentStateAction value = StagedOrderChangeShipmentStateAction.of();
        value.setShipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped"));
    }
}
