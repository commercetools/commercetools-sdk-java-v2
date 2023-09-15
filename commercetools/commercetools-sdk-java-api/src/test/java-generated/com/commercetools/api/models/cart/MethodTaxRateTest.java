
package com.commercetools.api.models.cart;

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
public class MethodTaxRateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MethodTaxRateBuilder builder) {
        MethodTaxRate methodTaxRate = builder.buildUnchecked();
        Assertions.assertThat(methodTaxRate).isInstanceOf(MethodTaxRate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MethodTaxRate.builder().shippingMethodKey("shippingMethodKey") },
                new Object[] { MethodTaxRate.builder()
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
