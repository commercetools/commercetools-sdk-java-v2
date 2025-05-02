
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetLineItemCustomFieldActionBuilder builder) {
        ShoppingListSetLineItemCustomFieldAction shoppingListSetLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetLineItemCustomFieldAction)
                .isInstanceOf(ShoppingListSetLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        ShoppingListSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        ShoppingListSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "name", ShoppingListSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", ShoppingListSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        ShoppingListSetLineItemCustomFieldAction value = ShoppingListSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        ShoppingListSetLineItemCustomFieldAction value = ShoppingListSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        ShoppingListSetLineItemCustomFieldAction value = ShoppingListSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ShoppingListSetLineItemCustomFieldAction value = ShoppingListSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
