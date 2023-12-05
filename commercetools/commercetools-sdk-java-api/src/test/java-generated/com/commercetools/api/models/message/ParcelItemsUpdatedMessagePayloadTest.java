
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
public class ParcelItemsUpdatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelItemsUpdatedMessagePayloadBuilder builder) {
        ParcelItemsUpdatedMessagePayload parcelItemsUpdatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(parcelItemsUpdatedMessagePayload).isInstanceOf(ParcelItemsUpdatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelItemsUpdatedMessagePayload.builder().parcelId("parcelId") },
                new Object[] { ParcelItemsUpdatedMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { ParcelItemsUpdatedMessagePayload.builder()
                        .items(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] {
                        ParcelItemsUpdatedMessagePayload.builder()
                                .oldItems(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { ParcelItemsUpdatedMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void parcelId() {
        ParcelItemsUpdatedMessagePayload value = ParcelItemsUpdatedMessagePayload.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void deliveryId() {
        ParcelItemsUpdatedMessagePayload value = ParcelItemsUpdatedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void items() {
        ParcelItemsUpdatedMessagePayload value = ParcelItemsUpdatedMessagePayload.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void oldItems() {
        ParcelItemsUpdatedMessagePayload value = ParcelItemsUpdatedMessagePayload.of();
        value.setOldItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getOldItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void shippingKey() {
        ParcelItemsUpdatedMessagePayload value = ParcelItemsUpdatedMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
