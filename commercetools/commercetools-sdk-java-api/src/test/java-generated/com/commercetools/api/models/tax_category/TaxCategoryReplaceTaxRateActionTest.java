
package com.commercetools.api.models.tax_category;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class TaxCategoryReplaceTaxRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategoryReplaceTaxRateActionBuilder builder) {
        TaxCategoryReplaceTaxRateAction taxCategoryReplaceTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryReplaceTaxRateAction).isInstanceOf(TaxCategoryReplaceTaxRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxCategoryReplaceTaxRateAction.builder().taxRateId("taxRateId") },
                new Object[] { TaxCategoryReplaceTaxRateAction.builder().taxRateKey("taxRateKey") },
                new Object[] { TaxCategoryReplaceTaxRateAction.builder()
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
