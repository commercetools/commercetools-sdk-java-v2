
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCountriesChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCountriesChangedMessageBuilder builder) {
        StoreCountriesChangedMessage storeCountriesChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(storeCountriesChangedMessage).isInstanceOf(StoreCountriesChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedCountries",
                        StoreCountriesChangedMessage.builder()
                                .addedCountries(Collections.singletonList(
                                    new com.commercetools.api.models.store_country.StoreCountryImpl())) },
                new Object[] { "removedCountries",
                        StoreCountriesChangedMessage.builder()
                                .removedCountries(Collections.singletonList(
                                    new com.commercetools.api.models.store_country.StoreCountryImpl())) } };
    }

    @Test
    public void addedCountries() {
        StoreCountriesChangedMessage value = StoreCountriesChangedMessage.of();
        value.setAddedCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getAddedCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }

    @Test
    public void removedCountries() {
        StoreCountriesChangedMessage value = StoreCountriesChangedMessage.of();
        value.setRemovedCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getRemovedCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }
}
