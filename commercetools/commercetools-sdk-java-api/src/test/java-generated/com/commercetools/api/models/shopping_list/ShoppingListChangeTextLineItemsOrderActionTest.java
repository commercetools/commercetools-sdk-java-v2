
package com.commercetools.api.models.shopping_list;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListChangeTextLineItemsOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListChangeTextLineItemsOrderActionBuilder builder) {
        ShoppingListChangeTextLineItemsOrderAction shoppingListChangeTextLineItemsOrderAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListChangeTextLineItemsOrderAction)
                .isInstanceOf(ShoppingListChangeTextLineItemsOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "textLineItemOrder", ShoppingListChangeTextLineItemsOrderAction.builder()
                .textLineItemOrder(Collections.singletonList("textLineItemOrder")) } };
    }

    @Test
    public void textLineItemOrder() {
        ShoppingListChangeTextLineItemsOrderAction value = ShoppingListChangeTextLineItemsOrderAction.of();
        value.setTextLineItemOrder(Collections.singletonList("textLineItemOrder"));
        Assertions.assertThat(value.getTextLineItemOrder()).isEqualTo(Collections.singletonList("textLineItemOrder"));
    }
}
