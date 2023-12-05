
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
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
public class ParcelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelBuilder builder) {
        Parcel parcel = builder.buildUnchecked();
        Assertions.assertThat(parcel).isInstanceOf(Parcel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Parcel.builder().id("id") },
                new Object[] { Parcel.builder().key("key") },
                new Object[] { Parcel.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Parcel.builder()
                        .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) },
                new Object[] {
                        Parcel.builder().trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { Parcel.builder()
                        .items(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { Parcel.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        Parcel value = Parcel.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        Parcel value = Parcel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
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
        value.setMeasurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
    }

    @Test
    public void trackingData() {
        Parcel value = Parcel.of();
        value.setTrackingData(new com.commercetools.api.models.order.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.api.models.order.TrackingDataImpl());
    }

    @Test
    public void items() {
        Parcel value = Parcel.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void custom() {
        Parcel value = Parcel.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
