
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
public class ParcelItemsUpdatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelItemsUpdatedMessageBuilder builder) {
        ParcelItemsUpdatedMessage parcelItemsUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelItemsUpdatedMessage).isInstanceOf(ParcelItemsUpdatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelItemsUpdatedMessage.builder().parcelId("parcelId") },
                new Object[] { ParcelItemsUpdatedMessage.builder().deliveryId("deliveryId") },
                new Object[] { ParcelItemsUpdatedMessage.builder()
                        .items(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] {
                        ParcelItemsUpdatedMessage.builder()
                                .oldItems(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { ParcelItemsUpdatedMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void parcelId() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void deliveryId() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void items() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void oldItems() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setOldItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getOldItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void shippingKey() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
