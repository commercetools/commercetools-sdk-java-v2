
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListChangeLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListChangeLineItemQuantityActionBuilder builder) {
        MyShoppingListChangeLineItemQuantityAction myShoppingListChangeLineItemQuantityAction = builder
                .buildUnchecked();
        Assertions.assertThat(myShoppingListChangeLineItemQuantityAction)
                .isInstanceOf(MyShoppingListChangeLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        MyShoppingListChangeLineItemQuantityAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        MyShoppingListChangeLineItemQuantityAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", MyShoppingListChangeLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        MyShoppingListChangeLineItemQuantityAction value = MyShoppingListChangeLineItemQuantityAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyShoppingListChangeLineItemQuantityAction value = MyShoppingListChangeLineItemQuantityAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        MyShoppingListChangeLineItemQuantityAction value = MyShoppingListChangeLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
