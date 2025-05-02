
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListRemoveTextLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListRemoveTextLineItemActionBuilder builder) {
        MyShoppingListRemoveTextLineItemAction myShoppingListRemoveTextLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListRemoveTextLineItemAction)
                .isInstanceOf(MyShoppingListRemoveTextLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        MyShoppingListRemoveTextLineItemAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        MyShoppingListRemoveTextLineItemAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "quantity", MyShoppingListRemoveTextLineItemAction.builder().quantity(8L) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListRemoveTextLineItemAction value = MyShoppingListRemoveTextLineItemAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListRemoveTextLineItemAction value = MyShoppingListRemoveTextLineItemAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void quantity() {
        MyShoppingListRemoveTextLineItemAction value = MyShoppingListRemoveTextLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
