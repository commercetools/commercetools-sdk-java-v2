
package com.commercetools.api.models.order_edit;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class StagedOrderSetReturnShipmentStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetReturnShipmentStateActionBuilder builder) {
        StagedOrderSetReturnShipmentStateAction stagedOrderSetReturnShipmentStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetReturnShipmentStateAction)
                .isInstanceOf(StagedOrderSetReturnShipmentStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetReturnShipmentStateAction.builder().returnItemId("returnItemId") },
                new Object[] { StagedOrderSetReturnShipmentStateAction.builder().returnItemKey("returnItemKey") },
                new Object[] { StagedOrderSetReturnShipmentStateAction.builder()
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
