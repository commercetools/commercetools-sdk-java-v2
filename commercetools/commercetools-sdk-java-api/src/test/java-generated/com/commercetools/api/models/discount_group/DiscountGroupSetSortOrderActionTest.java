
package com.commercetools.api.models.discount_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupSetSortOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupSetSortOrderActionBuilder builder) {
        DiscountGroupSetSortOrderAction discountGroupSetSortOrderAction = builder.buildUnchecked();
        Assertions.assertThat(discountGroupSetSortOrderAction).isInstanceOf(DiscountGroupSetSortOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "sortOrder", DiscountGroupSetSortOrderAction.builder().sortOrder("sortOrder") } };
    }

    @Test
    public void sortOrder() {
        DiscountGroupSetSortOrderAction value = DiscountGroupSetSortOrderAction.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }
}
