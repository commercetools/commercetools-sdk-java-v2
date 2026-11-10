
package com.commercetools.api.models.tax_category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryAddTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryAddTaxRateActionBuilder builder) {
        TaxCategoryAddTaxRateAction taxCategoryAddTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryAddTaxRateAction).isInstanceOf(TaxCategoryAddTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxRate", TaxCategoryAddTaxRateAction.builder()
                .taxRate(new com.commercetools.api.models.tax_category.TaxRateDraftImpl()) } };
    }

    @Test
    public void taxRate() {
        TaxCategoryAddTaxRateAction value = TaxCategoryAddTaxRateAction.of();
        value.setTaxRate(new com.commercetools.api.models.tax_category.TaxRateDraftImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxRateDraftImpl());
    }
}
