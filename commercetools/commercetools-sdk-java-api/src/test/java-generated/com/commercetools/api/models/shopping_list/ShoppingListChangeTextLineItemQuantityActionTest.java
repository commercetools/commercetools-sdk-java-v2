
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListChangeTextLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListChangeTextLineItemQuantityActionBuilder builder) {
        ShoppingListChangeTextLineItemQuantityAction shoppingListChangeTextLineItemQuantityAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListChangeTextLineItemQuantityAction)
                .isInstanceOf(ShoppingListChangeTextLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        ShoppingListChangeTextLineItemQuantityAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        ShoppingListChangeTextLineItemQuantityAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "quantity", ShoppingListChangeTextLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListChangeTextLineItemQuantityAction value = ShoppingListChangeTextLineItemQuantityAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListChangeTextLineItemQuantityAction value = ShoppingListChangeTextLineItemQuantityAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void quantity() {
        ShoppingListChangeTextLineItemQuantityAction value = ShoppingListChangeTextLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
