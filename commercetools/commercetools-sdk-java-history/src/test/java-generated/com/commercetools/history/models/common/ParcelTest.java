
package com.commercetools.history.models.common;

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
                new Object[] { Parcel.builder().createdAt("createdAt") },
                new Object[] { Parcel.builder()
                        .measurements(new com.commercetools.history.models.common.ParcelMeasurementsImpl()) },
                new Object[] {
                        Parcel.builder().trackingData(new com.commercetools.history.models.common.TrackingDataImpl()) },
                new Object[] { Parcel.builder()
                        .items(Collections
                                .singletonList(new com.commercetools.history.models.common.DeliveryItemImpl())) } };
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
        value.setCreatedAt("createdAt");
        Assertions.assertThat(value.getCreatedAt()).isEqualTo("createdAt");
    }

    @Test
    public void measurements() {
        Parcel value = Parcel.of();
        value.setMeasurements(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
    }

    @Test
    public void trackingData() {
        Parcel value = Parcel.of();
        value.setTrackingData(new com.commercetools.history.models.common.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.history.models.common.TrackingDataImpl());
    }

    @Test
    public void items() {
        Parcel value = Parcel.of();
        value.setItems(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DeliveryItemImpl()));
    }
}
