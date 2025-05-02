
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListRemoveTextLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListRemoveTextLineItemActionBuilder builder) {
        ShoppingListRemoveTextLineItemAction shoppingListRemoveTextLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListRemoveTextLineItemAction)
                .isInstanceOf(ShoppingListRemoveTextLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        ShoppingListRemoveTextLineItemAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        ShoppingListRemoveTextLineItemAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "quantity", ShoppingListRemoveTextLineItemAction.builder().quantity(8L) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListRemoveTextLineItemAction value = ShoppingListRemoveTextLineItemAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListRemoveTextLineItemAction value = ShoppingListRemoveTextLineItemAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void quantity() {
        ShoppingListRemoveTextLineItemAction value = ShoppingListRemoveTextLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
