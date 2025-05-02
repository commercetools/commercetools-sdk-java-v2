
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CountryNotConfiguredInStoreErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CountryNotConfiguredInStoreErrorBuilder builder) {
        CountryNotConfiguredInStoreError countryNotConfiguredInStoreError = builder.buildUnchecked();
        Assertions.assertThat(countryNotConfiguredInStoreError).isInstanceOf(CountryNotConfiguredInStoreError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", CountryNotConfiguredInStoreError.builder().message("message") },
                new Object[] { "storeCountries",
                        CountryNotConfiguredInStoreError.builder()
                                .storeCountries(Collections.singletonList("storeCountries")) },
                new Object[] { "country", CountryNotConfiguredInStoreError.builder().country("country") } };
    }

    @Test
    public void message() {
        CountryNotConfiguredInStoreError value = CountryNotConfiguredInStoreError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void storeCountries() {
        CountryNotConfiguredInStoreError value = CountryNotConfiguredInStoreError.of();
        value.setStoreCountries(Collections.singletonList("storeCountries"));
        Assertions.assertThat(value.getStoreCountries()).isEqualTo(Collections.singletonList("storeCountries"));
    }

    @Test
    public void country() {
        CountryNotConfiguredInStoreError value = CountryNotConfiguredInStoreError.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }
}
