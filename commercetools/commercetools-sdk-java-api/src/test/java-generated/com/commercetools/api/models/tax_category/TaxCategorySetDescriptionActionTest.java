
package com.commercetools.api.models.tax_category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategorySetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategorySetDescriptionActionBuilder builder) {
        TaxCategorySetDescriptionAction taxCategorySetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategorySetDescriptionAction).isInstanceOf(TaxCategorySetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "description", TaxCategorySetDescriptionAction.builder().description("description") } };
    }

    @Test
    public void description() {
        TaxCategorySetDescriptionAction value = TaxCategorySetDescriptionAction.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }
}
