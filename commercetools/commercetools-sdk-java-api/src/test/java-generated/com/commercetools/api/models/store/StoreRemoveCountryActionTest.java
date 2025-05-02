
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreRemoveCountryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreRemoveCountryActionBuilder builder) {
        StoreRemoveCountryAction storeRemoveCountryAction = builder.buildUnchecked();
        Assertions.assertThat(storeRemoveCountryAction).isInstanceOf(StoreRemoveCountryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "country", StoreRemoveCountryAction.builder()
                .country(new com.commercetools.api.models.store_country.StoreCountryImpl()) } };
    }

    @Test
    public void country() {
        StoreRemoveCountryAction value = StoreRemoveCountryAction.of();
        value.setCountry(new com.commercetools.api.models.store_country.StoreCountryImpl());
        Assertions.assertThat(value.getCountry())
                .isEqualTo(new com.commercetools.api.models.store_country.StoreCountryImpl());
    }
}
