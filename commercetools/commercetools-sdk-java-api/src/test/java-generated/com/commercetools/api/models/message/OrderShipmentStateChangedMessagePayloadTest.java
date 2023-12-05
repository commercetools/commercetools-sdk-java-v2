
package com.commercetools.api.models.message;

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
public class OrderShipmentStateChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderShipmentStateChangedMessagePayloadBuilder builder) {
        OrderShipmentStateChangedMessagePayload orderShipmentStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderShipmentStateChangedMessagePayload)
                .isInstanceOf(OrderShipmentStateChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderShipmentStateChangedMessagePayload.builder()
                        .shipmentState(com.commercetools.api.models.order.ShipmentState.findEnum("Shipped")) },
                new Object[] { OrderShipmentStateChangedMessagePayload.builder()
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
