
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLocaleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLocaleActionBuilder builder) {
        CartSetLocaleAction cartSetLocaleAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLocaleAction).isInstanceOf(CartSetLocaleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "locale", CartSetLocaleAction.builder().locale("locale") } };
    }

    @Test
    public void locale() {
        CartSetLocaleAction value = CartSetLocaleAction.of();
        value.setLocale("locale");
        Assertions.assertThat(value.getLocale()).isEqualTo("locale");
    }
}
