
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartAddItemShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartAddItemShippingAddressActionBuilder builder) {
        CartAddItemShippingAddressAction cartAddItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(cartAddItemShippingAddressAction).isInstanceOf(CartAddItemShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", CartAddItemShippingAddressAction.builder()
                .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void address() {
        CartAddItemShippingAddressAction value = CartAddItemShippingAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
