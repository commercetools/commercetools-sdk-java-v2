
package com.commercetools.history.models.common;

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
public class ShippingRatePriceTierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingRatePriceTierBuilder builder) {
        ShippingRatePriceTier shippingRatePriceTier = builder.buildUnchecked();
        Assertions.assertThat(shippingRatePriceTier).isInstanceOf(ShippingRatePriceTier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingRatePriceTier.builder()
                .type(com.commercetools.history.models.common.ShippingRateTierType.findEnum("CartValue")) } };
    }

    @Test
    public void type() {
        ShippingRatePriceTier value = ShippingRatePriceTier.of();
        value.setType(com.commercetools.history.models.common.ShippingRateTierType.findEnum("CartValue"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.history.models.common.ShippingRateTierType.findEnum("CartValue"));
    }
}
