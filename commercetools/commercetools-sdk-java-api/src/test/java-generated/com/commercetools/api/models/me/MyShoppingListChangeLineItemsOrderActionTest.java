
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyShoppingListChangeLineItemsOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyShoppingListChangeLineItemsOrderActionBuilder builder) {
        MyShoppingListChangeLineItemsOrderAction myShoppingListChangeLineItemsOrderAction = builder.buildUnchecked();
        Assertions.assertThat(myShoppingListChangeLineItemsOrderAction)
                .isInstanceOf(MyShoppingListChangeLineItemsOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "lineItemOrder", MyShoppingListChangeLineItemsOrderAction.builder()
                .lineItemOrder(Collections.singletonList("lineItemOrder")) } };
    }

    @Test
    public void lineItemOrder() {
        MyShoppingListChangeLineItemsOrderAction value = MyShoppingListChangeLineItemsOrderAction.of();
        value.setLineItemOrder(Collections.singletonList("lineItemOrder"));
        Assertions.assertThat(value.getLineItemOrder()).isEqualTo(Collections.singletonList("lineItemOrder"));
    }
}
