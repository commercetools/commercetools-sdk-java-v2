
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartChangeLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartChangeLineItemQuantityActionBuilder builder) {
        MyCartChangeLineItemQuantityAction myCartChangeLineItemQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(myCartChangeLineItemQuantityAction)
                .isInstanceOf(MyCartChangeLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", MyCartChangeLineItemQuantityAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", MyCartChangeLineItemQuantityAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", MyCartChangeLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void lineItemId() {
        MyCartChangeLineItemQuantityAction value = MyCartChangeLineItemQuantityAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartChangeLineItemQuantityAction value = MyCartChangeLineItemQuantityAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        MyCartChangeLineItemQuantityAction value = MyCartChangeLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
