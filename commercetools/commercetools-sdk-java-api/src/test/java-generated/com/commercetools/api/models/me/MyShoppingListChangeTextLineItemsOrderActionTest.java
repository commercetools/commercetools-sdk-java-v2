
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListChangeTextLineItemsOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListChangeTextLineItemsOrderActionBuilder builder) {
        MyShoppingListChangeTextLineItemsOrderAction myShoppingListChangeTextLineItemsOrderAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListChangeTextLineItemsOrderAction)
                .isInstanceOf(MyShoppingListChangeTextLineItemsOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "textLineItemOrder", MyShoppingListChangeTextLineItemsOrderAction.builder()
                        .textLineItemOrder(Collections.singletonList("textLineItemOrder")) } };
    }

    @Test
    public void textLineItemOrder() {
        MyShoppingListChangeTextLineItemsOrderAction value = MyShoppingListChangeTextLineItemsOrderAction.of();
        value.setTextLineItemOrder(Collections.singletonList("textLineItemOrder"));
        Assertions.assertThat(value.getTextLineItemOrder()).isEqualTo(Collections.singletonList("textLineItemOrder"));
    }
}
