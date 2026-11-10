
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelTrackingDataUpdatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelTrackingDataUpdatedMessagePayloadBuilder builder) {
        ParcelTrackingDataUpdatedMessagePayload parcelTrackingDataUpdatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(parcelTrackingDataUpdatedMessagePayload)
                .isInstanceOf(ParcelTrackingDataUpdatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        ParcelTrackingDataUpdatedMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { "parcelId", ParcelTrackingDataUpdatedMessagePayload.builder().parcelId("parcelId") },
                new Object[] { "trackingData",
                        ParcelTrackingDataUpdatedMessagePayload.builder()
                                .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { "shippingKey",
                        ParcelTrackingDataUpdatedMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        ParcelTrackingDataUpdatedMessagePayload value = ParcelTrackingDataUpdatedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void parcelId() {
        ParcelTrackingDataUpdatedMessagePayload value = ParcelTrackingDataUpdatedMessagePayload.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void trackingData() {
        ParcelTrackingDataUpdatedMessagePayload value = ParcelTrackingDataUpdatedMessagePayload.of();
        value.setTrackingData(new com.commercetools.api.models.order.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.api.models.order.TrackingDataImpl());
    }

    @Test
    public void shippingKey() {
        ParcelTrackingDataUpdatedMessagePayload value = ParcelTrackingDataUpdatedMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
