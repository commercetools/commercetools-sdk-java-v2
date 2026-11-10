
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryRemovedMessagePayloadBuilder builder) {
        DeliveryRemovedMessagePayload deliveryRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryRemovedMessagePayload).isInstanceOf(DeliveryRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "delivery",
                        DeliveryRemovedMessagePayload.builder()
                                .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { "shippingKey", DeliveryRemovedMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void delivery() {
        DeliveryRemovedMessagePayload value = DeliveryRemovedMessagePayload.of();
        value.setDelivery(new com.commercetools.api.models.order.DeliveryImpl());
        Assertions.assertThat(value.getDelivery()).isEqualTo(new com.commercetools.api.models.order.DeliveryImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryRemovedMessagePayload value = DeliveryRemovedMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
