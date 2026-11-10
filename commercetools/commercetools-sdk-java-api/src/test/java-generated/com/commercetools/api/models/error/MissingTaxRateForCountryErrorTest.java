
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MissingTaxRateForCountryErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MissingTaxRateForCountryErrorBuilder builder) {
        MissingTaxRateForCountryError missingTaxRateForCountryError = builder.buildUnchecked();
        Assertions.assertThat(missingTaxRateForCountryError).isInstanceOf(MissingTaxRateForCountryError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", MissingTaxRateForCountryError.builder().message("message") },
                new Object[] { "taxCategoryId",
                        MissingTaxRateForCountryError.builder().taxCategoryId("taxCategoryId") },
                new Object[] { "country", MissingTaxRateForCountryError.builder().country("country") },
                new Object[] { "state", MissingTaxRateForCountryError.builder().state("state") } };
    }

    @Test
    public void message() {
        MissingTaxRateForCountryError value = MissingTaxRateForCountryError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void taxCategoryId() {
        MissingTaxRateForCountryError value = MissingTaxRateForCountryError.of();
        value.setTaxCategoryId("taxCategoryId");
        Assertions.assertThat(value.getTaxCategoryId()).isEqualTo("taxCategoryId");
    }

    @Test
    public void country() {
        MissingTaxRateForCountryError value = MissingTaxRateForCountryError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void state() {
        MissingTaxRateForCountryError value = MissingTaxRateForCountryError.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }
}
