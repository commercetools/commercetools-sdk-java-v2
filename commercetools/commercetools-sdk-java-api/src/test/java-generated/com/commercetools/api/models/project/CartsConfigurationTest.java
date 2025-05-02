
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
                        CartsConfiguration.builder().deleteDaysAfterLastModification(3L) },
                new Object[] { "countryTaxRateFallbackEnabled",
                        CartsConfiguration.builder().countryTaxRateFallbackEnabled(true) } };
    }

    @Test
    public void deleteDaysAfterLastModification() {
        CartsConfiguration value = CartsConfiguration.of();
        value.setDeleteDaysAfterLastModification(3L);
        Assertions.assertThat(value.getDeleteDaysAfterLastModification()).isEqualTo(3L);
    }

    @Test
    public void countryTaxRateFallbackEnabled() {
        CartsConfiguration value = CartsConfiguration.of();
        value.setCountryTaxRateFallbackEnabled(true);
        Assertions.assertThat(value.getCountryTaxRateFallbackEnabled()).isEqualTo(true);
    }
}
