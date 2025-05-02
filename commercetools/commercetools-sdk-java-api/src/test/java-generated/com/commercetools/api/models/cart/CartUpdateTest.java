
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartUpdateBuilder builder) {
        CartUpdate cartUpdate = builder.buildUnchecked();
        Assertions.assertThat(cartUpdate).isInstanceOf(CartUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", CartUpdate.builder().version(2L) }, new Object[] { "actions",
                CartUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.cart.CartUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CartUpdate value = CartUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CartUpdate value = CartUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.cart.CartUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.CartUpdateActionImpl()));
    }
}
