
package com.commercetools.api.models.shopping_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShoppingListSetTextLineItemDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShoppingListSetTextLineItemDescriptionActionBuilder builder) {
        ShoppingListSetTextLineItemDescriptionAction shoppingListSetTextLineItemDescriptionAction = builder
                .buildUnchecked();
        Assertions.assertThat(shoppingListSetTextLineItemDescriptionAction)
                .isInstanceOf(ShoppingListSetTextLineItemDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        ShoppingListSetTextLineItemDescriptionAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        ShoppingListSetTextLineItemDescriptionAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "description", ShoppingListSetTextLineItemDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void textLineItemId() {
        ShoppingListSetTextLineItemDescriptionAction value = ShoppingListSetTextLineItemDescriptionAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        ShoppingListSetTextLineItemDescriptionAction value = ShoppingListSetTextLineItemDescriptionAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void description() {
        ShoppingListSetTextLineItemDescriptionAction value = ShoppingListSetTextLineItemDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
