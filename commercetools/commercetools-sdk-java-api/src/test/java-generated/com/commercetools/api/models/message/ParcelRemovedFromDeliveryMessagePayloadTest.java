
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelRemovedFromDeliveryMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelRemovedFromDeliveryMessagePayloadBuilder builder) {
        ParcelRemovedFromDeliveryMessagePayload parcelRemovedFromDeliveryMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(parcelRemovedFromDeliveryMessagePayload)
                .isInstanceOf(ParcelRemovedFromDeliveryMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        ParcelRemovedFromDeliveryMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { "parcel",
                        ParcelRemovedFromDeliveryMessagePayload.builder()
                                .parcel(new com.commercetools.api.models.order.ParcelImpl()) },
                new Object[] { "shippingKey",
                        ParcelRemovedFromDeliveryMessagePayload.builder().shippingKey("shippingKey") } };
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
