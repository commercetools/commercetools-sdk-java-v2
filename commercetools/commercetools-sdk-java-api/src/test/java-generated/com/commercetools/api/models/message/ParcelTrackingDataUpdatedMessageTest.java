
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelTrackingDataUpdatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelTrackingDataUpdatedMessageBuilder builder) {
        ParcelTrackingDataUpdatedMessage parcelTrackingDataUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelTrackingDataUpdatedMessage).isInstanceOf(ParcelTrackingDataUpdatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", ParcelTrackingDataUpdatedMessage.builder().deliveryId("deliveryId") },
                new Object[] { "parcelId", ParcelTrackingDataUpdatedMessage.builder().parcelId("parcelId") },
                new Object[] { "trackingData",
                        ParcelTrackingDataUpdatedMessage.builder()
                                .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { "shippingKey", ParcelTrackingDataUpdatedMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        ParcelTrackingDataUpdatedMessage value = ParcelTrackingDataUpdatedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void parcelId() {
        ParcelTrackingDataUpdatedMessage value = ParcelTrackingDataUpdatedMessage.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void trackingData() {
        ParcelTrackingDataUpdatedMessage value = ParcelTrackingDataUpdatedMessage.of();
        value.setTrackingData(new com.commercetools.api.models.order.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.api.models.order.TrackingDataImpl());
    }

    @Test
    public void shippingKey() {
        ParcelTrackingDataUpdatedMessage value = ParcelTrackingDataUpdatedMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
