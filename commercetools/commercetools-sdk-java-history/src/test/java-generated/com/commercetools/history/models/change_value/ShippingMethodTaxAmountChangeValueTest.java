
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodTaxAmountChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodTaxAmountChangeValueBuilder builder) {
        ShippingMethodTaxAmountChangeValue shippingMethodTaxAmountChangeValue = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodTaxAmountChangeValue)
                .isInstanceOf(ShippingMethodTaxAmountChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "taxedPrice",
                        ShippingMethodTaxAmountChangeValue.builder()
                                .taxedPrice(new com.commercetools.history.models.common.TaxedPriceImpl()) },
                new Object[] { "taxRate", ShippingMethodTaxAmountChangeValue.builder()
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
