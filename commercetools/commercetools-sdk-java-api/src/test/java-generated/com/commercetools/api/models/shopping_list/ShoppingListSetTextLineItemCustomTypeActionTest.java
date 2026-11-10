
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetTextLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetTextLineItemCustomTypeActionBuilder builder) {
        ShoppingListSetTextLineItemCustomTypeAction shoppingListSetTextLineItemCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListSetTextLineItemCustomTypeAction)
                .isInstanceOf(ShoppingListSetTextLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        ShoppingListSetTextLineItemCustomTypeAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        ShoppingListSetTextLineItemCustomTypeAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "type",
                        ShoppingListSetTextLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", ShoppingListSetTextLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListSetTextLineItemCustomTypeAction value = ShoppingListSetTextLineItemCustomTypeAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListSetTextLineItemCustomTypeAction value = ShoppingListSetTextLineItemCustomTypeAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void type() {
        ShoppingListSetTextLineItemCustomTypeAction value = ShoppingListSetTextLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        ShoppingListSetTextLineItemCustomTypeAction value = ShoppingListSetTextLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
