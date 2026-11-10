
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomerEmailActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomerEmailActionBuilder builder) {
        CartSetCustomerEmailAction cartSetCustomerEmailAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomerEmailAction).isInstanceOf(CartSetCustomerEmailAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", CartSetCustomerEmailAction.builder().email("email") } };
    }

    @Test
    public void email() {
        CartSetCustomerEmailAction value = CartSetCustomerEmailAction.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
