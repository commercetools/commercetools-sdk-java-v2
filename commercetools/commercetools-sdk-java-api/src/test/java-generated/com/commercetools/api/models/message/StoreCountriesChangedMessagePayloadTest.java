
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCountriesChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCountriesChangedMessagePayloadBuilder builder) {
        StoreCountriesChangedMessagePayload storeCountriesChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(storeCountriesChangedMessagePayload)
                .isInstanceOf(StoreCountriesChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedCountries",
                        StoreCountriesChangedMessagePayload.builder()
                                .addedCountries(Collections.singletonList(
                                    new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { "removedCountries",
                        StoreCountriesChangedMessagePayload.builder()
                                .removedCountries(Collections.singletonList(
                                    new com.commercetools.api.models.store_country.StoreCountryImpl())) } };
    }

    @Test
    public void addedCountries() {
        StoreCountriesChangedMessagePayload value = StoreCountriesChangedMessagePayload.of();
        value.setAddedCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getAddedCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }

    @Test
    public void removedCountries() {
        StoreCountriesChangedMessagePayload value = StoreCountriesChangedMessagePayload.of();
        value.setRemovedCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getRemovedCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }
}
