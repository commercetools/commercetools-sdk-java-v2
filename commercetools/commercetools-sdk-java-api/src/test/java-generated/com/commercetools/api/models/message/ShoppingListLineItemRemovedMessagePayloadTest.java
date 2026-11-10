
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListLineItemRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListLineItemRemovedMessagePayloadBuilder builder) {
        ShoppingListLineItemRemovedMessagePayload shoppingListLineItemRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(shoppingListLineItemRemovedMessagePayload)
                .isInstanceOf(ShoppingListLineItemRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "lineItem", ShoppingListLineItemRemovedMessagePayload.builder()
                .lineItem(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl()) } };
    }

    @Test
    public void lineItem() {
        ShoppingListLineItemRemovedMessagePayload value = ShoppingListLineItemRemovedMessagePayload.of();
        value.setLineItem(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.api.models.shopping_list.ShoppingListLineItemImpl());
    }
}
