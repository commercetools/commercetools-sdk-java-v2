
package com.commercetools.api.models.tax_category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TaxCategoryRemoveTaxRateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TaxCategoryRemoveTaxRateActionBuilder builder) {
        TaxCategoryRemoveTaxRateAction taxCategoryRemoveTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryRemoveTaxRateAction).isInstanceOf(TaxCategoryRemoveTaxRateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "taxRateId", TaxCategoryRemoveTaxRateAction.builder().taxRateId("taxRateId") },
                new Object[] { "taxRateKey", TaxCategoryRemoveTaxRateAction.builder().taxRateKey("taxRateKey") } };
    }

    @Test
    public void taxRateId() {
        TaxCategoryRemoveTaxRateAction value = TaxCategoryRemoveTaxRateAction.of();
        value.setTaxRateId("taxRateId");
        Assertions.assertThat(value.getTaxRateId()).isEqualTo("taxRateId");
    }

    @Test
    public void taxRateKey() {
        TaxCategoryRemoveTaxRateAction value = TaxCategoryRemoveTaxRateAction.of();
        value.setTaxRateKey("taxRateKey");
        Assertions.assertThat(value.getTaxRateKey()).isEqualTo("taxRateKey");
    }
}
