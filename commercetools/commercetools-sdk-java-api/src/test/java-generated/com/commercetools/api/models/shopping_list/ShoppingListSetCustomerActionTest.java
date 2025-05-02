
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetCustomerActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetCustomerActionBuilder builder) {
        ShoppingListSetCustomerAction shoppingListSetCustomerAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetCustomerAction).isInstanceOf(ShoppingListSetCustomerAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customer", ShoppingListSetCustomerAction.builder()
                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) } };
    }

    @Test
    public void customer() {
        ShoppingListSetCustomerAction value = ShoppingListSetCustomerAction.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }
}
