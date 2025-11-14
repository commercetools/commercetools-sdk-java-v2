
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MethodTaxedPriceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MethodTaxedPriceBuilder builder) {
        MethodTaxedPrice methodTaxedPrice = builder.buildUnchecked();
        Assertions.assertThat(methodTaxedPrice).isInstanceOf(MethodTaxedPrice.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingMethodKey", MethodTaxedPrice.builder().shippingMethodKey("shippingMethodKey") },
                new Object[] { "taxedPrice", MethodTaxedPrice.builder()
                        .taxedPrice(new com.commercetools.history.models.common.TaxedItemPriceImpl()) } };
    }

    @Test
    public void shippingMethodKey() {
        MethodTaxedPrice value = MethodTaxedPrice.of();
        value.setShippingMethodKey("shippingMethodKey");
        Assertions.assertThat(value.getShippingMethodKey()).isEqualTo("shippingMethodKey");
    }

    @Test
    public void taxedPrice() {
        MethodTaxedPrice value = MethodTaxedPrice.of();
        value.setTaxedPrice(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }
}
