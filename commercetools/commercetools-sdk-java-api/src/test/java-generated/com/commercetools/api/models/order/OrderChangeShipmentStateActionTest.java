
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
public class OrderChangeShipmentStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderChangeShipmentStateActionBuilder builder) {
        OrderChangeShipmentStateAction orderChangeShipmentStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderChangeShipmentStateAction).isInstanceOf(OrderChangeShipmentStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderChangeShipmentStateAction.builder()
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
