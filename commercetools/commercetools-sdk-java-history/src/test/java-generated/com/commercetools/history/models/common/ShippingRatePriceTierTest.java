
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingRatePriceTierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingRatePriceTierBuilder builder) {
        ShippingRatePriceTier shippingRatePriceTier = builder.buildUnchecked();
        Assertions.assertThat(shippingRatePriceTier).isInstanceOf(ShippingRatePriceTier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", ShippingRatePriceTier.builder()
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
