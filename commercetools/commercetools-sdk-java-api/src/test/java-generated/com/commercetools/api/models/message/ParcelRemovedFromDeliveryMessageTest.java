
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelRemovedFromDeliveryMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelRemovedFromDeliveryMessageBuilder builder) {
        ParcelRemovedFromDeliveryMessage parcelRemovedFromDeliveryMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelRemovedFromDeliveryMessage).isInstanceOf(ParcelRemovedFromDeliveryMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", ParcelRemovedFromDeliveryMessage.builder().deliveryId("deliveryId") },
                new Object[] { "parcel",
                        ParcelRemovedFromDeliveryMessage.builder()
                                .parcel(new com.commercetools.api.models.order.ParcelImpl()) },
                new Object[] { "shippingKey", ParcelRemovedFromDeliveryMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        ParcelRemovedFromDeliveryMessage value = ParcelRemovedFromDeliveryMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void parcel() {
        ParcelRemovedFromDeliveryMessage value = ParcelRemovedFromDeliveryMessage.of();
        value.setParcel(new com.commercetools.api.models.order.ParcelImpl());
        Assertions.assertThat(value.getParcel()).isEqualTo(new com.commercetools.api.models.order.ParcelImpl());
    }

    @Test
    public void shippingKey() {
        ParcelRemovedFromDeliveryMessage value = ParcelRemovedFromDeliveryMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
