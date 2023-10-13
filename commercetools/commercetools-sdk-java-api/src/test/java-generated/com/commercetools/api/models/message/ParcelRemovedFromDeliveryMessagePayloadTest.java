
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
public class ParcelRemovedFromDeliveryMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelRemovedFromDeliveryMessagePayloadBuilder builder) {
        ParcelRemovedFromDeliveryMessagePayload parcelRemovedFromDeliveryMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(parcelRemovedFromDeliveryMessagePayload)
                .isInstanceOf(ParcelRemovedFromDeliveryMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ParcelRemovedFromDeliveryMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { ParcelRemovedFromDeliveryMessagePayload.builder()
                        .parcel(new com.commercetools.api.models.order.ParcelImpl()) },
                new Object[] { ParcelRemovedFromDeliveryMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        ParcelRemovedFromDeliveryMessagePayload value = ParcelRemovedFromDeliveryMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void parcel() {
        ParcelRemovedFromDeliveryMessagePayload value = ParcelRemovedFromDeliveryMessagePayload.of();
        value.setParcel(new com.commercetools.api.models.order.ParcelImpl());
        Assertions.assertThat(value.getParcel()).isEqualTo(new com.commercetools.api.models.order.ParcelImpl());
    }

    @Test
    public void shippingKey() {
        ParcelRemovedFromDeliveryMessagePayload value = ParcelRemovedFromDeliveryMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
