
package com.commercetools.importapi.models.order_patches;

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
public class ParcelTrackingDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelTrackingDataBuilder builder) {
        ParcelTrackingData parcelTrackingData = builder.buildUnchecked();
        Assertions.assertThat(parcelTrackingData).isInstanceOf(ParcelTrackingData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelTrackingData.builder().parcelId("parcelId") },
                new Object[] { ParcelTrackingData.builder()
                        .trackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl()) } };
    }

    @Test
    public void parcelId() {
        ParcelTrackingData value = ParcelTrackingData.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void trackingData() {
        ParcelTrackingData value = ParcelTrackingData.of();
        value.setTrackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.importapi.models.orders.TrackingDataImpl());
    }
}
