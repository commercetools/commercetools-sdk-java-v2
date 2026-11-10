
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryAddedMessagePayloadBuilder builder) {
        DeliveryAddedMessagePayload deliveryAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryAddedMessagePayload).isInstanceOf(DeliveryAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "delivery",
                        DeliveryAddedMessagePayload.builder()
                                .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { "shippingKey", DeliveryAddedMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void delivery() {
        DeliveryAddedMessagePayload value = DeliveryAddedMessagePayload.of();
        value.setDelivery(new com.commercetools.api.models.order.DeliveryImpl());
        Assertions.assertThat(value.getDelivery()).isEqualTo(new com.commercetools.api.models.order.DeliveryImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryAddedMessagePayload value = DeliveryAddedMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
