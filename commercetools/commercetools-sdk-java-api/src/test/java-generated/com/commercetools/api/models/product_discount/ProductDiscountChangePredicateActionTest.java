
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountChangePredicateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountChangePredicateActionBuilder builder) {
        ProductDiscountChangePredicateAction productDiscountChangePredicateAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountChangePredicateAction)
                .isInstanceOf(ProductDiscountChangePredicateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", ProductDiscountChangePredicateAction.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ProductDiscountChangePredicateAction value = ProductDiscountChangePredicateAction.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
