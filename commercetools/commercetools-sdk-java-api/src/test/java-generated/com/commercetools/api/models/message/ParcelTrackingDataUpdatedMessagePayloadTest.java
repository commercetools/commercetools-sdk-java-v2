
package com.commercetools.api.models.message;

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
public class ParcelTrackingDataUpdatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelTrackingDataUpdatedMessagePayloadBuilder builder) {
        ParcelTrackingDataUpdatedMessagePayload parcelTrackingDataUpdatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(parcelTrackingDataUpdatedMessagePayload)
                .isInstanceOf(ParcelTrackingDataUpdatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ParcelTrackingDataUpdatedMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { ParcelTrackingDataUpdatedMessagePayload.builder().parcelId("parcelId") },
                new Object[] { ParcelTrackingDataUpdatedMessagePayload.builder()
                        .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { ParcelTrackingDataUpdatedMessagePayload.builder().shippingKey("shippingKey") } };
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
