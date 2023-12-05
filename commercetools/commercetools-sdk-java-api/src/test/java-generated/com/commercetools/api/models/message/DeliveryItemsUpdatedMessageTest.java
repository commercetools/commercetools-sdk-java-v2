
package com.commercetools.api.models.message;

import java.util.Collections;

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
public class DeliveryItemsUpdatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryItemsUpdatedMessageBuilder builder) {
        DeliveryItemsUpdatedMessage deliveryItemsUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryItemsUpdatedMessage).isInstanceOf(DeliveryItemsUpdatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DeliveryItemsUpdatedMessage.builder().deliveryId("deliveryId") },
                new Object[] { DeliveryItemsUpdatedMessage.builder()
                        .items(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] {
                        DeliveryItemsUpdatedMessage.builder()
                                .oldItems(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { DeliveryItemsUpdatedMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        DeliveryItemsUpdatedMessage value = DeliveryItemsUpdatedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void items() {
        DeliveryItemsUpdatedMessage value = DeliveryItemsUpdatedMessage.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void oldItems() {
        DeliveryItemsUpdatedMessage value = DeliveryItemsUpdatedMessage.of();
        value.setOldItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getOldItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void shippingKey() {
        DeliveryItemsUpdatedMessage value = DeliveryItemsUpdatedMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
