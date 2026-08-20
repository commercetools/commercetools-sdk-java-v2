
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartEstimatedDeliverySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartEstimatedDeliverySetMessagePayloadBuilder builder) {
        CartEstimatedDeliverySetMessagePayload cartEstimatedDeliverySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(cartEstimatedDeliverySetMessagePayload)
                .isInstanceOf(CartEstimatedDeliverySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "estimatedDelivery",
                        CartEstimatedDeliverySetMessagePayload.builder()
                                .estimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl()) },
                new Object[] { "shippingKey",
                        CartEstimatedDeliverySetMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void estimatedDelivery() {
        CartEstimatedDeliverySetMessagePayload value = CartEstimatedDeliverySetMessagePayload.of();
        value.setEstimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
        Assertions.assertThat(value.getEstimatedDelivery())
                .isEqualTo(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
    }

    @Test
    public void shippingKey() {
        CartEstimatedDeliverySetMessagePayload value = CartEstimatedDeliverySetMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
