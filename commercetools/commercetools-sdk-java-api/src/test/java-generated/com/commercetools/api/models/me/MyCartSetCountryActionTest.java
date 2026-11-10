
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetCountryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetCountryActionBuilder builder) {
        MyCartSetCountryAction myCartSetCountryAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetCountryAction).isInstanceOf(MyCartSetCountryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "country", MyCartSetCountryAction.builder().country("country") } };
    }

    @Test
    public void country() {
        MyCartSetCountryAction value = MyCartSetCountryAction.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }
}
