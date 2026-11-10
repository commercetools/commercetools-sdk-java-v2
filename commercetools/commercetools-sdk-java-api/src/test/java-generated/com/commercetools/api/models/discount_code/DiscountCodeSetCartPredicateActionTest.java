
package com.commercetools.api.models.discount_code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountCodeSetCartPredicateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountCodeSetCartPredicateActionBuilder builder) {
        DiscountCodeSetCartPredicateAction discountCodeSetCartPredicateAction = builder.buildUnchecked();
        Assertions.assertThat(discountCodeSetCartPredicateAction)
                .isInstanceOf(DiscountCodeSetCartPredicateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cartPredicate",
                DiscountCodeSetCartPredicateAction.builder().cartPredicate("cartPredicate") } };
    }

    @Test
    public void cartPredicate() {
        DiscountCodeSetCartPredicateAction value = DiscountCodeSetCartPredicateAction.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }
}
