
package com.commercetools.checkout.models.application;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCountriesUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCountriesUpdateActionBuilder builder) {
        SetCountriesUpdateAction setCountriesUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setCountriesUpdateAction).isInstanceOf(SetCountriesUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "countries",
                SetCountriesUpdateAction.builder().countries(Collections.singletonList("countries")) } };
    }

    @Test
    public void countries() {
        SetCountriesUpdateAction value = SetCountriesUpdateAction.of();
        value.setCountries(Collections.singletonList("countries"));
        Assertions.assertThat(value.getCountries()).isEqualTo(Collections.singletonList("countries"));
    }
}
