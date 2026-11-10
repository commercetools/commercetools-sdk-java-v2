
package com.commercetools.importapi.models.order_patches;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelTrackingDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelTrackingDataBuilder builder) {
        ParcelTrackingData parcelTrackingData = builder.buildUnchecked();
        Assertions.assertThat(parcelTrackingData).isInstanceOf(ParcelTrackingData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parcelId", ParcelTrackingData.builder().parcelId("parcelId") },
                new Object[] { "trackingData", ParcelTrackingData.builder()
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
