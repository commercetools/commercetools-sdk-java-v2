
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountChangeStackingModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountChangeStackingModeActionBuilder builder) {
        CartDiscountChangeStackingModeAction cartDiscountChangeStackingModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeStackingModeAction)
                .isInstanceOf(CartDiscountChangeStackingModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stackingMode", CartDiscountChangeStackingModeAction.builder()
                .stackingMode(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking")) } };
    }

    @Test
    public void stackingMode() {
        CartDiscountChangeStackingModeAction value = CartDiscountChangeStackingModeAction.of();
        value.setStackingMode(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking"));
        Assertions.assertThat(value.getStackingMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking"));
    }
}
