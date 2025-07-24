
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartsConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartsConfigurationBuilder builder) {
        CartsConfiguration cartsConfiguration = builder.buildUnchecked();
        Assertions.assertThat(cartsConfiguration).isInstanceOf(CartsConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deleteDaysAfterLastModification",
                        CartsConfiguration.builder().deleteDaysAfterLastModification(3) },
                new Object[] { "countryTaxRateFallbackEnabled",
                        CartsConfiguration.builder().countryTaxRateFallbackEnabled(true) },
                new Object[] { "priceRoundingMode", CartsConfiguration.builder()
                        .priceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) },
                new Object[] { "taxRoundingMode", CartsConfiguration.builder()
                        .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        CartsConfiguration value = CartsConfiguration.of();
        value.setDeleteDaysAfterLastModification(3);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3);
    }

    @Test
    public void countryTaxRateFallbackEnabled() {
        CartsConfiguration value = CartsConfiguration.of();
        value.setCountryTaxRateFallbackEnabled(true);
        Assertions.assertThat(value.getCountryTaxRateFallbackEnabled()).isEqualTo(true);
    }

    @Test
    public void priceRoundingMode() {
        CartsConfiguration value = CartsConfiguration.of();
        value.setPriceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPriceRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }

    @Test
    public void taxRoundingMode() {
        CartsConfiguration value = CartsConfiguration.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }
}
