
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryRemovedMessageBuilder builder) {
        DeliveryRemovedMessage deliveryRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryRemovedMessage).isInstanceOf(DeliveryRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "delivery",
                        DeliveryRemovedMessage.builder()
                                .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { "shippingKey", DeliveryRemovedMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void delivery() {
        DeliveryRemovedMessage value = DeliveryRemovedMessage.of();
        value.setDelivery(new com.commercetools.api.models.order.DeliveryImpl());
        Assertions.assertThat(value.getDelivery()).isEqualTo(new com.commercetools.api.models.order.DeliveryImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryRemovedMessage value = DeliveryRemovedMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
