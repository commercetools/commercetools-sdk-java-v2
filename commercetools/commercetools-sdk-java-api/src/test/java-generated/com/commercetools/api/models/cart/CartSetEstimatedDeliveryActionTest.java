
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetEstimatedDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetEstimatedDeliveryActionBuilder builder) {
        CartSetEstimatedDeliveryAction cartSetEstimatedDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetEstimatedDeliveryAction).isInstanceOf(CartSetEstimatedDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey", CartSetEstimatedDeliveryAction.builder().shippingKey("shippingKey") },
                new Object[] { "estimatedDelivery", CartSetEstimatedDeliveryAction.builder()
                        .estimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl()) } };
    }

    @Test
    public void shippingKey() {
        CartSetEstimatedDeliveryAction value = CartSetEstimatedDeliveryAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void estimatedDelivery() {
        CartSetEstimatedDeliveryAction value = CartSetEstimatedDeliveryAction.of();
        value.setEstimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
        Assertions.assertThat(value.getEstimatedDelivery())
                .isEqualTo(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
    }
}
