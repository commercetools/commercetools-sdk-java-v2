
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
public class OrderRemoveDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderRemoveDeliveryActionBuilder builder) {
        OrderRemoveDeliveryAction orderRemoveDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderRemoveDeliveryAction).isInstanceOf(OrderRemoveDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderRemoveDeliveryAction.builder().deliveryId("deliveryId") },
                new Object[] { OrderRemoveDeliveryAction.builder().deliveryKey("deliveryKey") } };
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
