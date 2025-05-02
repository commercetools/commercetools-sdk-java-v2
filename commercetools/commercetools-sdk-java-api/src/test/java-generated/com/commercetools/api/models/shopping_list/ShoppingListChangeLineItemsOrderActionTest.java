
package com.commercetools.api.models.shopping_list;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListChangeLineItemsOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListChangeLineItemsOrderActionBuilder builder) {
        ShoppingListChangeLineItemsOrderAction shoppingListChangeLineItemsOrderAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListChangeLineItemsOrderAction)
                .isInstanceOf(ShoppingListChangeLineItemsOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "lineItemOrder", ShoppingListChangeLineItemsOrderAction.builder()
                .lineItemOrder(Collections.singletonList("lineItemOrder")) } };
    }

    @Test
    public void lineItemOrder() {
        ShoppingListChangeLineItemsOrderAction value = ShoppingListChangeLineItemsOrderAction.of();
        value.setLineItemOrder(Collections.singletonList("lineItemOrder"));
        Assertions.assertThat(value.getLineItemOrder()).isEqualTo(Collections.singletonList("lineItemOrder"));
    }
}
