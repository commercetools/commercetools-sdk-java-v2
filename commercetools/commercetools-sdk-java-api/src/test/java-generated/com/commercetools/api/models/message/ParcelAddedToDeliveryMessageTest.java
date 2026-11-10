
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelAddedToDeliveryMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelAddedToDeliveryMessageBuilder builder) {
        ParcelAddedToDeliveryMessage parcelAddedToDeliveryMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelAddedToDeliveryMessage).isInstanceOf(ParcelAddedToDeliveryMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "delivery",
                        ParcelAddedToDeliveryMessage.builder()
                                .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { "parcel",
                        ParcelAddedToDeliveryMessage.builder()
                                .parcel(new com.commercetools.api.models.order.ParcelImpl()) },
                new Object[] { "shippingKey", ParcelAddedToDeliveryMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void delivery() {
        ParcelAddedToDeliveryMessage value = ParcelAddedToDeliveryMessage.of();
        value.setDelivery(new com.commercetools.api.models.order.DeliveryImpl());
        Assertions.assertThat(value.getDelivery()).isEqualTo(new com.commercetools.api.models.order.DeliveryImpl());
    }

    @Test
    public void parcel() {
        ParcelAddedToDeliveryMessage value = ParcelAddedToDeliveryMessage.of();
        value.setParcel(new com.commercetools.api.models.order.ParcelImpl());
        Assertions.assertThat(value.getParcel()).isEqualTo(new com.commercetools.api.models.order.ParcelImpl());
    }

    @Test
    public void shippingKey() {
        ParcelAddedToDeliveryMessage value = ParcelAddedToDeliveryMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
