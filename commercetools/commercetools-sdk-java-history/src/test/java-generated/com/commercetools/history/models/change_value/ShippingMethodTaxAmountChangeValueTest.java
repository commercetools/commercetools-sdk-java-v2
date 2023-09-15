
package com.commercetools.history.models.change_value;

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
public class ShippingMethodTaxAmountChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodTaxAmountChangeValueBuilder builder) {
        ShippingMethodTaxAmountChangeValue shippingMethodTaxAmountChangeValue = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodTaxAmountChangeValue)
                .isInstanceOf(ShippingMethodTaxAmountChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ShippingMethodTaxAmountChangeValue.builder()
                        .taxedPrice(new com.commercetools.history.models.common.TaxedPriceImpl()) },
                new Object[] { ShippingMethodTaxAmountChangeValue.builder()
                        .taxRate(new com.commercetools.history.models.common.TaxRateImpl()) } };
    }

    @Test
    public void taxedPrice() {
        ShippingMethodTaxAmountChangeValue value = ShippingMethodTaxAmountChangeValue.of();
        value.setTaxedPrice(new com.commercetools.history.models.common.TaxedPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.history.models.common.TaxedPriceImpl());
    }

    @Test
    public void taxRate() {
        ShippingMethodTaxAmountChangeValue value = ShippingMethodTaxAmountChangeValue.of();
        value.setTaxRate(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate()).isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }
}
