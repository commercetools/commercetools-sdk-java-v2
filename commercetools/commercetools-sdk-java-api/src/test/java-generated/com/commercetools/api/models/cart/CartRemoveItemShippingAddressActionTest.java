
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartRemoveItemShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartRemoveItemShippingAddressActionBuilder builder) {
        CartRemoveItemShippingAddressAction cartRemoveItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(cartRemoveItemShippingAddressAction)
                .isInstanceOf(CartRemoveItemShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressKey", CartRemoveItemShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressKey() {
        CartRemoveItemShippingAddressAction value = CartRemoveItemShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
