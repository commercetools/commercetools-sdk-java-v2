
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetKeyActionBuilder builder) {
        ShoppingListSetKeyAction shoppingListSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetKeyAction).isInstanceOf(ShoppingListSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ShoppingListSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ShoppingListSetKeyAction value = ShoppingListSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
