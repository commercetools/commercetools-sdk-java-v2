
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartUpdateItemShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartUpdateItemShippingAddressActionBuilder builder) {
        CartUpdateItemShippingAddressAction cartUpdateItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(cartUpdateItemShippingAddressAction)
                .isInstanceOf(CartUpdateItemShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", CartUpdateItemShippingAddressAction.builder()
                .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void address() {
        CartUpdateItemShippingAddressAction value = CartUpdateItemShippingAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
