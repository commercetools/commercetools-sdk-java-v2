
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
public class OrderSetDeliveryAddressCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetDeliveryAddressCustomFieldActionBuilder builder) {
        OrderSetDeliveryAddressCustomFieldAction orderSetDeliveryAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryAddressCustomFieldAction)
                .isInstanceOf(OrderSetDeliveryAddressCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSetDeliveryAddressCustomFieldAction.builder().deliveryId("deliveryId") },
                new Object[] { OrderSetDeliveryAddressCustomFieldAction.builder().deliveryKey("deliveryKey") },
                new Object[] { OrderSetDeliveryAddressCustomFieldAction.builder().name("name") },
                new Object[] { OrderSetDeliveryAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryAddressCustomFieldAction value = OrderSetDeliveryAddressCustomFieldAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryAddressCustomFieldAction value = OrderSetDeliveryAddressCustomFieldAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void name() {
        OrderSetDeliveryAddressCustomFieldAction value = OrderSetDeliveryAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetDeliveryAddressCustomFieldAction value = OrderSetDeliveryAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
