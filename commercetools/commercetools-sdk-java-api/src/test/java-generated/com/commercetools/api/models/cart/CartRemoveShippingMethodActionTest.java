
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartRemoveShippingMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartRemoveShippingMethodActionBuilder builder) {
        CartRemoveShippingMethodAction cartRemoveShippingMethodAction = builder.buildUnchecked();
        Assertions.assertThat(cartRemoveShippingMethodAction).isInstanceOf(CartRemoveShippingMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey", CartRemoveShippingMethodAction.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void shippingKey() {
        CartRemoveShippingMethodAction value = CartRemoveShippingMethodAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
