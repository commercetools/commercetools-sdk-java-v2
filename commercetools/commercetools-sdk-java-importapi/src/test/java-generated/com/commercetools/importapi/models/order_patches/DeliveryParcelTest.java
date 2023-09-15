
package com.commercetools.importapi.models.order_patches;

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
public class DeliveryParcelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryParcelBuilder builder) {
        DeliveryParcel deliveryParcel = builder.buildUnchecked();
        Assertions.assertThat(deliveryParcel).isInstanceOf(DeliveryParcel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DeliveryParcel.builder().deliveryId("deliveryId") },
                new Object[] { DeliveryParcel.builder()
                        .measurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl()) },
                new Object[] { DeliveryParcel.builder()
                        .trackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl()) },
                new Object[] { DeliveryParcel.builder()
                        .items(Collections
                                .singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl())) } };
    }

    @Test
    public void deliveryId() {
        DeliveryParcel value = DeliveryParcel.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void measurements() {
        DeliveryParcel value = DeliveryParcel.of();
        value.setMeasurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl());
    }

    @Test
    public void trackingData() {
        DeliveryParcel value = DeliveryParcel.of();
        value.setTrackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.importapi.models.orders.TrackingDataImpl());
    }

    @Test
    public void items() {
        DeliveryParcel value = DeliveryParcel.of();
        value.setItems(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
    }
}
