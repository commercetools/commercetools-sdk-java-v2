
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCountryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCountryActionBuilder builder) {
        CartSetCountryAction cartSetCountryAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCountryAction).isInstanceOf(CartSetCountryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "country", CartSetCountryAction.builder().country("country") } };
    }

    @Test
    public void country() {
        CartSetCountryAction value = CartSetCountryAction.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }
}
