
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetLineItemCustomTypeActionBuilder builder) {
        ShoppingListSetLineItemCustomTypeAction shoppingListSetLineItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListSetLineItemCustomTypeAction)
                .isInstanceOf(ShoppingListSetLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        ShoppingListSetLineItemCustomTypeAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        ShoppingListSetLineItemCustomTypeAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "type",
                        ShoppingListSetLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", ShoppingListSetLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void lineItemId() {
        ShoppingListSetLineItemCustomTypeAction value = ShoppingListSetLineItemCustomTypeAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        ShoppingListSetLineItemCustomTypeAction value = ShoppingListSetLineItemCustomTypeAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void type() {
        ShoppingListSetLineItemCustomTypeAction value = ShoppingListSetLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        ShoppingListSetLineItemCustomTypeAction value = ShoppingListSetLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
