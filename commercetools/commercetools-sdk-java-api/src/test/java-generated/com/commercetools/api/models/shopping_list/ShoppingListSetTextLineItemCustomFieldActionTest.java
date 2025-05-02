
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetTextLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetTextLineItemCustomFieldActionBuilder builder) {
        ShoppingListSetTextLineItemCustomFieldAction shoppingListSetTextLineItemCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListSetTextLineItemCustomFieldAction)
                .isInstanceOf(ShoppingListSetTextLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        ShoppingListSetTextLineItemCustomFieldAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        ShoppingListSetTextLineItemCustomFieldAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "name", ShoppingListSetTextLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", ShoppingListSetTextLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListSetTextLineItemCustomFieldAction value = ShoppingListSetTextLineItemCustomFieldAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListSetTextLineItemCustomFieldAction value = ShoppingListSetTextLineItemCustomFieldAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void name() {
        ShoppingListSetTextLineItemCustomFieldAction value = ShoppingListSetTextLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ShoppingListSetTextLineItemCustomFieldAction value = ShoppingListSetTextLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
