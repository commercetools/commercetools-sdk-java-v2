
package com.commercetools.api.models.shipping_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodChangeTaxCategoryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodChangeTaxCategoryActionBuilder builder) {
        ShippingMethodChangeTaxCategoryAction shippingMethodChangeTaxCategoryAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeTaxCategoryAction)
                .isInstanceOf(ShippingMethodChangeTaxCategoryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxCategory", ShippingMethodChangeTaxCategoryAction.builder()
                .taxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) } };
    }

    @Test
    public void taxCategory() {
        ShippingMethodChangeTaxCategoryAction value = ShippingMethodChangeTaxCategoryAction.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }
}
