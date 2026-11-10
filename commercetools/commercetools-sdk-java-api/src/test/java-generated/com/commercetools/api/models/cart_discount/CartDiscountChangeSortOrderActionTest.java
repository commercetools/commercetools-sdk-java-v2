
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountChangeSortOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountChangeSortOrderActionBuilder builder) {
        CartDiscountChangeSortOrderAction cartDiscountChangeSortOrderAction = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountChangeSortOrderAction).isInstanceOf(CartDiscountChangeSortOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "sortOrder", CartDiscountChangeSortOrderAction.builder().sortOrder("sortOrder") } };
    }

    @Test
    public void sortOrder() {
        CartDiscountChangeSortOrderAction value = CartDiscountChangeSortOrderAction.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }
}
