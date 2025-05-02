
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountChangeRequiresDiscountCodeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountChangeRequiresDiscountCodeActionBuilder builder) {
        CartDiscountChangeRequiresDiscountCodeAction cartDiscountChangeRequiresDiscountCodeAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartDiscountChangeRequiresDiscountCodeAction)
                .isInstanceOf(CartDiscountChangeRequiresDiscountCodeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "requiresDiscountCode",
                CartDiscountChangeRequiresDiscountCodeAction.builder().requiresDiscountCode(true) } };
    }

    @Test
    public void requiresDiscountCode() {
        CartDiscountChangeRequiresDiscountCodeAction value = CartDiscountChangeRequiresDiscountCodeAction.of();
        value.setRequiresDiscountCode(true);
        Assertions.assertThat(value.getRequiresDiscountCode()).isEqualTo(true);
    }
}
