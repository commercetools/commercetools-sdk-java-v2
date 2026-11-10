
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListChangeLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListChangeLineItemQuantityActionBuilder builder) {
        ShoppingListChangeLineItemQuantityAction shoppingListChangeLineItemQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListChangeLineItemQuantityAction)
                .isInstanceOf(ShoppingListChangeLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        ShoppingListChangeLineItemQuantityAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        ShoppingListChangeLineItemQuantityAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", ShoppingListChangeLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        ShoppingListChangeLineItemQuantityAction value = ShoppingListChangeLineItemQuantityAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        ShoppingListChangeLineItemQuantityAction value = ShoppingListChangeLineItemQuantityAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        ShoppingListChangeLineItemQuantityAction value = ShoppingListChangeLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
