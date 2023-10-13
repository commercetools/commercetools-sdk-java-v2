
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
public class ParcelTrackingDataUpdatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelTrackingDataUpdatedMessageBuilder builder) {
        ParcelTrackingDataUpdatedMessage parcelTrackingDataUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelTrackingDataUpdatedMessage).isInstanceOf(ParcelTrackingDataUpdatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelTrackingDataUpdatedMessage.builder().deliveryId("deliveryId") },
                new Object[] { ParcelTrackingDataUpdatedMessage.builder().parcelId("parcelId") },
                new Object[] { ParcelTrackingDataUpdatedMessage.builder()
                        .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { ParcelTrackingDataUpdatedMessage.builder().shippingKey("shippingKey") } };
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
