
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelAddedToDeliveryMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelAddedToDeliveryMessagePayloadBuilder builder) {
        ParcelAddedToDeliveryMessagePayload parcelAddedToDeliveryMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(parcelAddedToDeliveryMessagePayload)
                .isInstanceOf(ParcelAddedToDeliveryMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "delivery",
                        ParcelAddedToDeliveryMessagePayload.builder()
                                .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { "parcel",
                        ParcelAddedToDeliveryMessagePayload.builder()
                                .parcel(new com.commercetools.api.models.order.ParcelImpl()) },
                new Object[] { "shippingKey",
                        ParcelAddedToDeliveryMessagePayload.builder().shippingKey("shippingKey") } };
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
