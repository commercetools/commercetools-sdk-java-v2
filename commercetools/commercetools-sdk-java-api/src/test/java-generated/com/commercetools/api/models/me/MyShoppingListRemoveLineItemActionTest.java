
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListRemoveLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListRemoveLineItemActionBuilder builder) {
        MyShoppingListRemoveLineItemAction myShoppingListRemoveLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListRemoveLineItemAction)
                .isInstanceOf(MyShoppingListRemoveLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", MyShoppingListRemoveLineItemAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", MyShoppingListRemoveLineItemAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", MyShoppingListRemoveLineItemAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        MyShoppingListRemoveLineItemAction value = MyShoppingListRemoveLineItemAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyShoppingListRemoveLineItemAction value = MyShoppingListRemoveLineItemAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        MyShoppingListRemoveLineItemAction value = MyShoppingListRemoveLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
