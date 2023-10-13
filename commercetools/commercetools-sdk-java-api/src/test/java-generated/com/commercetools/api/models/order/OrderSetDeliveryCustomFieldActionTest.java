
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
public class OrderSetDeliveryCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetDeliveryCustomFieldActionBuilder builder) {
        OrderSetDeliveryCustomFieldAction orderSetDeliveryCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryCustomFieldAction).isInstanceOf(OrderSetDeliveryCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderSetDeliveryCustomFieldAction.builder().deliveryId("deliveryId") },
                new Object[] { OrderSetDeliveryCustomFieldAction.builder().deliveryKey("deliveryKey") },
                new Object[] { OrderSetDeliveryCustomFieldAction.builder().name("name") },
                new Object[] { OrderSetDeliveryCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryCustomFieldAction value = OrderSetDeliveryCustomFieldAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryCustomFieldAction value = OrderSetDeliveryCustomFieldAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void name() {
        OrderSetDeliveryCustomFieldAction value = OrderSetDeliveryCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetDeliveryCustomFieldAction value = OrderSetDeliveryCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
