
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListChangeTextLineItemNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListChangeTextLineItemNameActionBuilder builder) {
        MyShoppingListChangeTextLineItemNameAction myShoppingListChangeTextLineItemNameAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListChangeTextLineItemNameAction)
                .isInstanceOf(MyShoppingListChangeTextLineItemNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemId",
                        MyShoppingListChangeTextLineItemNameAction.builder().textLineItemId("textLineItemId") },
                new Object[] { "textLineItemKey",
                        MyShoppingListChangeTextLineItemNameAction.builder().textLineItemKey("textLineItemKey") },
                new Object[] { "name", MyShoppingListChangeTextLineItemNameAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void textLineItemId() {
        MyShoppingListChangeTextLineItemNameAction value = MyShoppingListChangeTextLineItemNameAction.of();
        value.setTextLineItemId("textLineItemId");
        Assertions.assertThat(value.getTextLineItemId()).isEqualTo("textLineItemId");
    }

    @Test
    public void textLineItemKey() {
        MyShoppingListChangeTextLineItemNameAction value = MyShoppingListChangeTextLineItemNameAction.of();
        value.setTextLineItemKey("textLineItemKey");
        Assertions.assertThat(value.getTextLineItemKey()).isEqualTo("textLineItemKey");
    }

    @Test
    public void name() {
        MyShoppingListChangeTextLineItemNameAction value = MyShoppingListChangeTextLineItemNameAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
