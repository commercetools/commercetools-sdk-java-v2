
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
public class TaxCategoryRemoveTaxRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategoryRemoveTaxRateActionBuilder builder) {
        TaxCategoryRemoveTaxRateAction taxCategoryRemoveTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryRemoveTaxRateAction).isInstanceOf(TaxCategoryRemoveTaxRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxCategoryRemoveTaxRateAction.builder().taxRateId("taxRateId") },
                new Object[] { TaxCategoryRemoveTaxRateAction.builder().taxRateKey("taxRateKey") } };
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
