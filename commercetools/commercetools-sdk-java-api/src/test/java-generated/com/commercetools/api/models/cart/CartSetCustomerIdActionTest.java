
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomerIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomerIdActionBuilder builder) {
        CartSetCustomerIdAction cartSetCustomerIdAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomerIdAction).isInstanceOf(CartSetCustomerIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerId", CartSetCustomerIdAction.builder().customerId("customerId") } };
    }

    @Test
    public void customerId() {
        CartSetCustomerIdAction value = CartSetCustomerIdAction.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }
}
