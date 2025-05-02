
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountChangeTargetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountChangeTargetActionBuilder builder) {
        CartDiscountChangeTargetAction cartDiscountChangeTargetAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeTargetAction).isInstanceOf(CartDiscountChangeTargetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "target", CartDiscountChangeTargetAction.builder()
                .target(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl()) } };
    }

    @Test
    public void target() {
        CartDiscountChangeTargetAction value = CartDiscountChangeTargetAction.of();
        value.setTarget(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
    }
}
