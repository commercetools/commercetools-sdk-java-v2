
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddCountryUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddCountryUpdateActionBuilder builder) {
        AddCountryUpdateAction addCountryUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(addCountryUpdateAction).isInstanceOf(AddCountryUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "country", AddCountryUpdateAction.builder().country("country") } };
    }

    @Test
    public void country() {
        AddCountryUpdateAction value = AddCountryUpdateAction.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }
}
