
package com.commercetools.api.models.tax_category;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryUpdateBuilder builder) {
        TaxCategoryUpdate taxCategoryUpdate = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryUpdate).isInstanceOf(TaxCategoryUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", TaxCategoryUpdate.builder().version(2L) },
                new Object[] { "actions",
                        TaxCategoryUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.tax_category.TaxCategoryUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        TaxCategoryUpdate value = TaxCategoryUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        TaxCategoryUpdate value = TaxCategoryUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.tax_category.TaxCategoryUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.tax_category.TaxCategoryUpdateActionImpl()));
    }
}
