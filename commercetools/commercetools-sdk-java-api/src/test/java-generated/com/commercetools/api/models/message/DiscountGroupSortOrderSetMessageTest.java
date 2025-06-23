
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupSortOrderSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupSortOrderSetMessageBuilder builder) {
        DiscountGroupSortOrderSetMessage discountGroupSortOrderSetMessage = builder.buildUnchecked();
        Assertions.assertThat(discountGroupSortOrderSetMessage).isInstanceOf(DiscountGroupSortOrderSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "sortOrder", DiscountGroupSortOrderSetMessage.builder().sortOrder("sortOrder") },
                new Object[] { "oldSortOrder",
                        DiscountGroupSortOrderSetMessage.builder().oldSortOrder("oldSortOrder") } };
    }

    @Test
    public void sortOrder() {
        DiscountGroupSortOrderSetMessage value = DiscountGroupSortOrderSetMessage.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }

    @Test
    public void oldSortOrder() {
        DiscountGroupSortOrderSetMessage value = DiscountGroupSortOrderSetMessage.of();
        value.setOldSortOrder("oldSortOrder");
        Assertions.assertThat(value.getOldSortOrder()).isEqualTo("oldSortOrder");
    }
}
