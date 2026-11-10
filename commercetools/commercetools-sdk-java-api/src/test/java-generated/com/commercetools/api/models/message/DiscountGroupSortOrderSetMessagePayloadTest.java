
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupSortOrderSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupSortOrderSetMessagePayloadBuilder builder) {
        DiscountGroupSortOrderSetMessagePayload discountGroupSortOrderSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(discountGroupSortOrderSetMessagePayload)
                .isInstanceOf(DiscountGroupSortOrderSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "sortOrder", DiscountGroupSortOrderSetMessagePayload.builder().sortOrder("sortOrder") },
                new Object[] { "oldSortOrder",
                        DiscountGroupSortOrderSetMessagePayload.builder().oldSortOrder("oldSortOrder") } };
    }

    @Test
    public void sortOrder() {
        DiscountGroupSortOrderSetMessagePayload value = DiscountGroupSortOrderSetMessagePayload.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }

    @Test
    public void oldSortOrder() {
        DiscountGroupSortOrderSetMessagePayload value = DiscountGroupSortOrderSetMessagePayload.of();
        value.setOldSortOrder("oldSortOrder");
        Assertions.assertThat(value.getOldSortOrder()).isEqualTo("oldSortOrder");
    }
}
