
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListRemoveLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListRemoveLineItemActionBuilder builder) {
        ShoppingListRemoveLineItemAction shoppingListRemoveLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListRemoveLineItemAction).isInstanceOf(ShoppingListRemoveLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", ShoppingListRemoveLineItemAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", ShoppingListRemoveLineItemAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", ShoppingListRemoveLineItemAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        ShoppingListRemoveLineItemAction value = ShoppingListRemoveLineItemAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        ShoppingListRemoveLineItemAction value = ShoppingListRemoveLineItemAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        ShoppingListRemoveLineItemAction value = ShoppingListRemoveLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
