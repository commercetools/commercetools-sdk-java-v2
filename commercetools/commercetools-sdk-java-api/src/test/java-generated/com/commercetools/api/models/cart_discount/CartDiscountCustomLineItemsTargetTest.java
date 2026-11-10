
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountCustomLineItemsTargetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountCustomLineItemsTargetBuilder builder) {
        CartDiscountCustomLineItemsTarget cartDiscountCustomLineItemsTarget = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountCustomLineItemsTarget).isInstanceOf(CartDiscountCustomLineItemsTarget.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", CartDiscountCustomLineItemsTarget.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        CartDiscountCustomLineItemsTarget value = CartDiscountCustomLineItemsTarget.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
