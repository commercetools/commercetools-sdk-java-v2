
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomerGroupActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomerGroupActionBuilder builder) {
        CartSetCustomerGroupAction cartSetCustomerGroupAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomerGroupAction).isInstanceOf(CartSetCustomerGroupAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroup",
                CartSetCustomerGroupAction.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) } };
    }

    @Test
    public void customerGroup() {
        CartSetCustomerGroupAction value = CartSetCustomerGroupAction.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }
}
