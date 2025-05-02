
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreAddCountryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreAddCountryActionBuilder builder) {
        StoreAddCountryAction storeAddCountryAction = builder.buildUnchecked();
        Assertions.assertThat(storeAddCountryAction).isInstanceOf(StoreAddCountryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "country", StoreAddCountryAction.builder()
                .country(new com.commercetools.api.models.store_country.StoreCountryImpl()) } };
    }

    @Test
    public void country() {
        StoreAddCountryAction value = StoreAddCountryAction.of();
        value.setCountry(new com.commercetools.api.models.store_country.StoreCountryImpl());
        Assertions.assertThat(value.getCountry())
                .isEqualTo(new com.commercetools.api.models.store_country.StoreCountryImpl());
    }
}
