
package com.commercetools.importapi.models.order_patches;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryParcelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryParcelBuilder builder) {
        DeliveryParcel deliveryParcel = builder.buildUnchecked();
        Assertions.assertThat(deliveryParcel).isInstanceOf(DeliveryParcel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "deliveryId", DeliveryParcel.builder().deliveryId("deliveryId") },
                new Object[] { "measurements",
                        DeliveryParcel.builder()
                                .measurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl()) },
                new Object[] { "trackingData",
                        DeliveryParcel.builder()
                                .trackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl()) },
                new Object[] { "items",
                        DeliveryParcel.builder()
                                .items(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.DeliveryItemImpl())) } };
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
