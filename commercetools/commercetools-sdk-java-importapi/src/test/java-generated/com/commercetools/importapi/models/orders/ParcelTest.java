
package com.commercetools.importapi.models.orders;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelBuilder builder) {
        Parcel parcel = builder.buildUnchecked();
        Assertions.assertThat(parcel).isInstanceOf(Parcel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Parcel.builder().id("id") },
                new Object[] { "createdAt", Parcel.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "measurements",
                        Parcel.builder()
                                .measurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl()) },
                new Object[] { "trackingData",
                        Parcel.builder()
                                .trackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl()) },
                new Object[] { "items",
                        Parcel.builder()
                                .items(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.DeliveryItemImpl())) },
                new Object[] { "custom",
                        Parcel.builder().custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void id() {
        Parcel value = Parcel.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void createdAt() {
        Parcel value = Parcel.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void measurements() {
        Parcel value = Parcel.of();
        value.setMeasurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl());
    }

    @Test
    public void trackingData() {
        Parcel value = Parcel.of();
        value.setTrackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.importapi.models.orders.TrackingDataImpl());
    }

    @Test
    public void items() {
        Parcel value = Parcel.of();
        value.setItems(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
    }

    @Test
    public void custom() {
        Parcel value = Parcel.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
