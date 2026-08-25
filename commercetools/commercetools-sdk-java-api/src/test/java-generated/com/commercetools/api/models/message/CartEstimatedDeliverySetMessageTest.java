
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartEstimatedDeliverySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartEstimatedDeliverySetMessageBuilder builder) {
        CartEstimatedDeliverySetMessage cartEstimatedDeliverySetMessage = builder.buildUnchecked();
        Assertions.assertThat(cartEstimatedDeliverySetMessage).isInstanceOf(CartEstimatedDeliverySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "estimatedDelivery",
                        CartEstimatedDeliverySetMessage.builder()
                                .estimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl()) },
                new Object[] { "shippingKey", CartEstimatedDeliverySetMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void estimatedDelivery() {
        CartEstimatedDeliverySetMessage value = CartEstimatedDeliverySetMessage.of();
        value.setEstimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
        Assertions.assertThat(value.getEstimatedDelivery())
                .isEqualTo(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
    }

    @Test
    public void shippingKey() {
        CartEstimatedDeliverySetMessage value = CartEstimatedDeliverySetMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
