
package com.commercetools.history.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingRateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingRateBuilder builder) {
        ShippingRate shippingRate = builder.buildUnchecked();
        Assertions.assertThat(shippingRate).isInstanceOf(ShippingRate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "price",
                        ShippingRate.builder()
                                .price(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "freeAbove",
                        ShippingRate.builder()
                                .freeAbove(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "isMatching", ShippingRate.builder().isMatching(true) },
                new Object[] { "tiers",
                        ShippingRate.builder()
                                .tiers(Collections.singletonList(
                                    new com.commercetools.history.models.common.ShippingRatePriceTierImpl())) } };
    }

    @Test
    public void price() {
        ShippingRate value = ShippingRate.of();
        value.setPrice(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getPrice())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void freeAbove() {
        ShippingRate value = ShippingRate.of();
        value.setFreeAbove(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getFreeAbove())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void isMatching() {
        ShippingRate value = ShippingRate.of();
        value.setIsMatching(true);
        Assertions.assertThat(value.getIsMatching()).isEqualTo(true);
    }

    @Test
    public void tiers() {
        ShippingRate value = ShippingRate.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.history.models.common.ShippingRatePriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.ShippingRatePriceTierImpl()));
    }
}
