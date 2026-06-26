
package com.commercetools.api.models.variant;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantBulkUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantBulkUpdateBuilder builder) {
        VariantBulkUpdate variantBulkUpdate = builder.buildUnchecked();
        Assertions.assertThat(variantBulkUpdate).isInstanceOf(VariantBulkUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "items",
                        VariantBulkUpdate.builder()
                                .items(Collections.singletonList(
                                    new com.commercetools.api.models.variant.VariantBulkUpdateItemImpl())) },
                new Object[] { "actions",
                        VariantBulkUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.variant.VariantUpdateActionImpl())) } };
    }

    @Test
    public void items() {
        VariantBulkUpdate value = VariantBulkUpdate.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.variant.VariantBulkUpdateItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.variant.VariantBulkUpdateItemImpl()));
    }

    @Test
    public void actions() {
        VariantBulkUpdate value = VariantBulkUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.variant.VariantUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.variant.VariantUpdateActionImpl()));
    }
}
