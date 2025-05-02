
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountChangeCartPredicateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountChangeCartPredicateActionBuilder builder) {
        CartDiscountChangeCartPredicateAction cartDiscountChangeCartPredicateAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeCartPredicateAction)
                .isInstanceOf(CartDiscountChangeCartPredicateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cartPredicate",
                CartDiscountChangeCartPredicateAction.builder().cartPredicate("cartPredicate") } };
    }

    @Test
    public void cartPredicate() {
        CartDiscountChangeCartPredicateAction value = CartDiscountChangeCartPredicateAction.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }
}
