
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
public class OrderReturnShipmentStateChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderReturnShipmentStateChangedMessageBuilder builder) {
        OrderReturnShipmentStateChangedMessage orderReturnShipmentStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderReturnShipmentStateChangedMessage)
                .isInstanceOf(OrderReturnShipmentStateChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderReturnShipmentStateChangedMessage.builder().returnItemId("returnItemId") },
                new Object[] { OrderReturnShipmentStateChangedMessage.builder()
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
