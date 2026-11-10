
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetCustomFieldActionBuilder builder) {
        ShoppingListSetCustomFieldAction shoppingListSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetCustomFieldAction).isInstanceOf(ShoppingListSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ShoppingListSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", ShoppingListSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        ShoppingListSetCustomFieldAction value = ShoppingListSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ShoppingListSetCustomFieldAction value = ShoppingListSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
