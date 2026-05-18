
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartFreezeCartActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartFreezeCartActionBuilder builder) {
        CartFreezeCartAction cartFreezeCartAction = builder.buildUnchecked();
        Assertions.assertThat(cartFreezeCartAction).isInstanceOf(CartFreezeCartAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "strategy", CartFreezeCartAction.builder()
                .strategy(com.commercetools.api.models.cart.FreezeStrategy.findEnum("SoftFreeze")) } };
    }

    @Test
    public void strategy() {
        CartFreezeCartAction value = CartFreezeCartAction.of();
        value.setStrategy(com.commercetools.api.models.cart.FreezeStrategy.findEnum("SoftFreeze"));
        Assertions.assertThat(value.getStrategy())
                .isEqualTo(com.commercetools.api.models.cart.FreezeStrategy.findEnum("SoftFreeze"));
    }
}
