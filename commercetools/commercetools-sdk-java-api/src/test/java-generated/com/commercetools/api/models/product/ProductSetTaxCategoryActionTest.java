
package com.commercetools.api.models.product;

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
public class ProductSetTaxCategoryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetTaxCategoryActionBuilder builder) {
        ProductSetTaxCategoryAction productSetTaxCategoryAction = builder.buildUnchecked();
        Assertions.assertThat(productSetTaxCategoryAction).isInstanceOf(ProductSetTaxCategoryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetTaxCategoryAction.builder()
                .taxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) } };
    }

    @Test
    public void taxCategory() {
        ProductSetTaxCategoryAction value = ProductSetTaxCategoryAction.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }
}
