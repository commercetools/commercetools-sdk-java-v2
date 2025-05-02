
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetTaxCategoryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetTaxCategoryActionBuilder builder) {
        ProductSetTaxCategoryAction productSetTaxCategoryAction = builder.buildUnchecked();
        Assertions.assertThat(productSetTaxCategoryAction).isInstanceOf(ProductSetTaxCategoryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxCategory", ProductSetTaxCategoryAction.builder()
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
