
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetKeyActionBuilder builder) {
        CartSetKeyAction cartSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetKeyAction).isInstanceOf(CartSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CartSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        CartSetKeyAction value = CartSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
