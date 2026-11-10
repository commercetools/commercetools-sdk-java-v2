
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListChangeTextLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListChangeTextLineItemQuantityActionBuilder builder) {
        MyShoppingListChangeTextLineItemQuantityAction myShoppingListChangeTextLineItemQuantityAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListChangeTextLineItemQuantityAction)
                .isInstanceOf(MyShoppingListChangeTextLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        MyShoppingListChangeTextLineItemQuantityAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        MyShoppingListChangeTextLineItemQuantityAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "quantity", MyShoppingListChangeTextLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListChangeTextLineItemQuantityAction value = MyShoppingListChangeTextLineItemQuantityAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListChangeTextLineItemQuantityAction value = MyShoppingListChangeTextLineItemQuantityAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void quantity() {
        MyShoppingListChangeTextLineItemQuantityAction value = MyShoppingListChangeTextLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
