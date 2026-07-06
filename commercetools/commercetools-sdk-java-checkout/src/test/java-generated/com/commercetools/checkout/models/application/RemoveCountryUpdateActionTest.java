
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveCountryUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveCountryUpdateActionBuilder builder) {
        RemoveCountryUpdateAction removeCountryUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(removeCountryUpdateAction).isInstanceOf(RemoveCountryUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "country", RemoveCountryUpdateAction.builder().country("country") } };
    }

    @Test
    public void country() {
        RemoveCountryUpdateAction value = RemoveCountryUpdateAction.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }
}
