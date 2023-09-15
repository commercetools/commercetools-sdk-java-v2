
package com.commercetools.api.models.order;

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
public class OrderSetReturnShipmentStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetReturnShipmentStateActionBuilder builder) {
        OrderSetReturnShipmentStateAction orderSetReturnShipmentStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnShipmentStateAction).isInstanceOf(OrderSetReturnShipmentStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSetReturnShipmentStateAction.builder().returnItemId("returnItemId") },
                new Object[] { OrderSetReturnShipmentStateAction.builder().returnItemKey("returnItemKey") },
                new Object[] { OrderSetReturnShipmentStateAction.builder()
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
