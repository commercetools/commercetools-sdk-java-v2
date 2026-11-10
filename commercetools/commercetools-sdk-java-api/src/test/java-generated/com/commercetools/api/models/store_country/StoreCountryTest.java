
package com.commercetools.api.models.store_country;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCountryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCountryBuilder builder) {
        StoreCountry storeCountry = builder.buildUnchecked();
        Assertions.assertThat(storeCountry).isInstanceOf(StoreCountry.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", StoreCountry.builder().code("code") } };
    }

    @Test
    public void code() {
        StoreCountry value = StoreCountry.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }
}
