
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MethodTaxRateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MethodTaxRateBuilder builder) {
        MethodTaxRate methodTaxRate = builder.buildUnchecked();
        Assertions.assertThat(methodTaxRate).isInstanceOf(MethodTaxRate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingMethodKey", MethodTaxRate.builder().shippingMethodKey("shippingMethodKey") },
                new Object[] { "taxRate", MethodTaxRate.builder()
                        .taxRate(new com.commercetools.api.models.tax_category.TaxRateImpl()) } };
    }

    @Test
    public void shippingMethodKey() {
        MethodTaxRate value = MethodTaxRate.of();
        value.setShippingMethodKey("shippingMethodKey");
        Assertions.assertThat(value.getShippingMethodKey()).isEqualTo("shippingMethodKey");
    }

    @Test
    public void taxRate() {
        MethodTaxRate value = MethodTaxRate.of();
        value.setTaxRate(new com.commercetools.api.models.tax_category.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxRateImpl());
    }
}
