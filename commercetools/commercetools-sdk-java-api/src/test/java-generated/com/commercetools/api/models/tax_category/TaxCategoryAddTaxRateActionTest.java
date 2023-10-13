
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
public class TaxCategoryAddTaxRateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TaxCategoryAddTaxRateActionBuilder builder) {
        TaxCategoryAddTaxRateAction taxCategoryAddTaxRateAction = builder.buildUnchecked();
        Assertions.assertThat(taxCategoryAddTaxRateAction).isInstanceOf(TaxCategoryAddTaxRateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TaxCategoryAddTaxRateAction.builder()
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
