
package com.commercetools.api.models.product_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDiscountChangeSortOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDiscountChangeSortOrderActionBuilder builder) {
        ProductDiscountChangeSortOrderAction productDiscountChangeSortOrderAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountChangeSortOrderAction)
                .isInstanceOf(ProductDiscountChangeSortOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "sortOrder", ProductDiscountChangeSortOrderAction.builder().sortOrder("sortOrder") } };
    }

    @Test
    public void sortOrder() {
        ProductDiscountChangeSortOrderAction value = ProductDiscountChangeSortOrderAction.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }
}
