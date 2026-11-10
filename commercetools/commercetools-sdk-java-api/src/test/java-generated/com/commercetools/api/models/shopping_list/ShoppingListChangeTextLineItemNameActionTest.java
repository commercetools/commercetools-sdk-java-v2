
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListChangeTextLineItemNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListChangeTextLineItemNameActionBuilder builder) {
        ShoppingListChangeTextLineItemNameAction shoppingListChangeTextLineItemNameAction = builder.buildUnchecked();
        Assertions.assertThat(shoppingListChangeTextLineItemNameAction)
                .isInstanceOf(ShoppingListChangeTextLineItemNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        ShoppingListChangeTextLineItemNameAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        ShoppingListChangeTextLineItemNameAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "name", ShoppingListChangeTextLineItemNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListChangeTextLineItemNameAction value = ShoppingListChangeTextLineItemNameAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListChangeTextLineItemNameAction value = ShoppingListChangeTextLineItemNameAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void name() {
        ShoppingListChangeTextLineItemNameAction value = ShoppingListChangeTextLineItemNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
