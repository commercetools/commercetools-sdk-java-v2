
package com.commercetools.api.models.store;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetCountriesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetCountriesActionBuilder builder) {
        StoreSetCountriesAction storeSetCountriesAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetCountriesAction).isInstanceOf(StoreSetCountriesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "countries", StoreSetCountriesAction.builder()
                .countries(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl())) } };
    }

    @Test
    public void countries() {
        StoreSetCountriesAction value = StoreSetCountriesAction.of();
        value.setCountries(
            Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
        Assertions.assertThat(value.getCountries())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store_country.StoreCountryImpl()));
    }
}
