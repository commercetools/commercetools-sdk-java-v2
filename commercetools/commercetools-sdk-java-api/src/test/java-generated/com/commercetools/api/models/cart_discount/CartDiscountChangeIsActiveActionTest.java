
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountChangeIsActiveActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountChangeIsActiveActionBuilder builder) {
        CartDiscountChangeIsActiveAction cartDiscountChangeIsActiveAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeIsActiveAction).isInstanceOf(CartDiscountChangeIsActiveAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "isActive", CartDiscountChangeIsActiveAction.builder().isActive(true) } };
    }

    @Test
    public void isActive() {
        CartDiscountChangeIsActiveAction value = CartDiscountChangeIsActiveAction.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }
}
