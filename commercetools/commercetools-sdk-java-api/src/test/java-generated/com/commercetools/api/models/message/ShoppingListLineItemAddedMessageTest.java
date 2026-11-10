
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListLineItemAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListLineItemAddedMessageBuilder builder) {
        ShoppingListLineItemAddedMessage shoppingListLineItemAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItemAddedMessage).isInstanceOf(ShoppingListLineItemAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "lineItem", ShoppingListLineItemAddedMessage.builder()
                .lineItem(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl()) } };
    }

    @Test
    public void lineItem() {
        ShoppingListLineItemAddedMessage value = ShoppingListLineItemAddedMessage.of();
        value.setLineItem(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl());
    }
}
