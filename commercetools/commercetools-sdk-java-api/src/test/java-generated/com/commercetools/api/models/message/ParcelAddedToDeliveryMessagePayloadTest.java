
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
public class ParcelAddedToDeliveryMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelAddedToDeliveryMessagePayloadBuilder builder) {
        ParcelAddedToDeliveryMessagePayload parcelAddedToDeliveryMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(parcelAddedToDeliveryMessagePayload)
                .isInstanceOf(ParcelAddedToDeliveryMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ParcelAddedToDeliveryMessagePayload.builder()
                        .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { ParcelAddedToDeliveryMessagePayload.builder()
                        .parcel(new com.commercetools.api.models.order.ParcelImpl()) },
                new Object[] { ParcelAddedToDeliveryMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void delivery() {
        ParcelAddedToDeliveryMessagePayload value = ParcelAddedToDeliveryMessagePayload.of();
        value.setDelivery(new com.commercetools.api.models.order.DeliveryImpl());
        Assertions.assertThat(value.getDelivery()).isEqualTo(new com.commercetools.api.models.order.DeliveryImpl());
    }

    @Test
    public void parcel() {
        ParcelAddedToDeliveryMessagePayload value = ParcelAddedToDeliveryMessagePayload.of();
        value.setParcel(new com.commercetools.api.models.order.ParcelImpl());
        Assertions.assertThat(value.getParcel()).isEqualTo(new com.commercetools.api.models.order.ParcelImpl());
    }

    @Test
    public void shippingKey() {
        ParcelAddedToDeliveryMessagePayload value = ParcelAddedToDeliveryMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
