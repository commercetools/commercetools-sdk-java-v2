
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountLineItemsTargetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountLineItemsTargetBuilder builder) {
        CartDiscountLineItemsTarget cartDiscountLineItemsTarget = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountLineItemsTarget).isInstanceOf(CartDiscountLineItemsTarget.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", CartDiscountLineItemsTarget.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        CartDiscountLineItemsTarget value = CartDiscountLineItemsTarget.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
