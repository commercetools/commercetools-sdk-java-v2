
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomFieldActionBuilder builder) {
        CartSetCustomFieldAction cartSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomFieldAction).isInstanceOf(CartSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CartSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", CartSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CartSetCustomFieldAction value = CartSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetCustomFieldAction value = CartSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
