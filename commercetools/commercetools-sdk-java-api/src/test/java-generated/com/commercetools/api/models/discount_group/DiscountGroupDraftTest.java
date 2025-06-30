
package com.commercetools.api.models.discount_group;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountGroupDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountGroupDraftBuilder builder) {
        DiscountGroupDraft discountGroupDraft = builder.buildUnchecked();
        Assertions.assertThat(discountGroupDraft).isInstanceOf(DiscountGroupDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        DiscountGroupDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", DiscountGroupDraft.builder().key("key") },
                new Object[] { "description",
                        DiscountGroupDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "sortOrder", DiscountGroupDraft.builder().sortOrder("sortOrder") } };
    }

    @Test
    public void name() {
        DiscountGroupDraft value = DiscountGroupDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        DiscountGroupDraft value = DiscountGroupDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        DiscountGroupDraft value = DiscountGroupDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void sortOrder() {
        DiscountGroupDraft value = DiscountGroupDraft.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }
}
