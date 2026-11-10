
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetReturnShipmentStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetReturnShipmentStateActionBuilder builder) {
        StagedOrderSetReturnShipmentStateAction stagedOrderSetReturnShipmentStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnShipmentStateAction)
                .isInstanceOf(StagedOrderSetReturnShipmentStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnItemId",
                        StagedOrderSetReturnShipmentStateAction.builder().returnItemId("returnItemId") },
                new Object[] { "returnItemKey",
                        StagedOrderSetReturnShipmentStateAction.builder().returnItemKey("returnItemKey") },
                new Object[] { "shipmentState", StagedOrderSetReturnShipmentStateAction.builder()
                        .shipmentState(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised")) } };
    }

    @Test
    public void returnItemId() {
        StagedOrderSetReturnShipmentStateAction value = StagedOrderSetReturnShipmentStateAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        StagedOrderSetReturnShipmentStateAction value = StagedOrderSetReturnShipmentStateAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void shipmentState() {
        StagedOrderSetReturnShipmentStateAction value = StagedOrderSetReturnShipmentStateAction.of();
        value.setShipmentState(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised"));
        Assertions.assertThat(value.getShipmentState())
                .isEqualTo(com.commercetools.api.models.order.ReturnShipmentState.findEnum("Advised"));
    }
}
