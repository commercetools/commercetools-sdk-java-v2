
package com.commercetools.api.models.tax_category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryReplaceTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryReplaceTaxRateActionBuilder builder) {
        TaxCategoryReplaceTaxRateAction taxCategoryReplaceTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryReplaceTaxRateAction).isInstanceOf(TaxCategoryReplaceTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "taxRateId", TaxCategoryReplaceTaxRateAction.builder().taxRateId("taxRateId") },
                new Object[] { "taxRateKey", TaxCategoryReplaceTaxRateAction.builder().taxRateKey("taxRateKey") },
                new Object[] { "taxRate", TaxCategoryReplaceTaxRateAction.builder()
                        .taxRate(new com.commercetools.api.models.tax_category.TaxRateDraftImpl()) } };
    }

    @Test
    public void taxRateId() {
        TaxCategoryReplaceTaxRateAction value = TaxCategoryReplaceTaxRateAction.of();
        value.setTaxRateId("taxRateId");
        Assertions.assertThat(value.getTaxRateId()).isEqualTo("taxRateId");
    }

    @Test
    public void taxRateKey() {
        TaxCategoryReplaceTaxRateAction value = TaxCategoryReplaceTaxRateAction.of();
        value.setTaxRateKey("taxRateKey");
        Assertions.assertThat(value.getTaxRateKey()).isEqualTo("taxRateKey");
    }

    @Test
    public void taxRate() {
        TaxCategoryReplaceTaxRateAction value = TaxCategoryReplaceTaxRateAction.of();
        value.setTaxRate(new com.commercetools.api.models.tax_category.TaxRateDraftImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxRateDraftImpl());
    }
}
