
package com.commercetools.api.models.cart_discount;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountUpdateBuilder builder) {
        CartDiscountUpdate cartDiscountUpdate = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountUpdate).isInstanceOf(CartDiscountUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", CartDiscountUpdate.builder().version(2L) },
                new Object[] { "actions",
                        CartDiscountUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.cart_discount.CartDiscountUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CartDiscountUpdate value = CartDiscountUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CartDiscountUpdate value = CartDiscountUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.cart_discount.CartDiscountUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart_discount.CartDiscountUpdateActionImpl()));
    }
}
