
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangeLineItemsOrderActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangeLineItemsOrderActionBuilder builder) {
        CartChangeLineItemsOrderAction cartChangeLineItemsOrderAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeLineItemsOrderAction).isInstanceOf(CartChangeLineItemsOrderAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "lineItemOrder",
                CartChangeLineItemsOrderAction.builder().lineItemOrder(Collections.singletonList("lineItemOrder")) } };
    }

    @Test
    public void lineItemOrder() {
        CartChangeLineItemsOrderAction value = CartChangeLineItemsOrderAction.of();
        value.setLineItemOrder(Collections.singletonList("lineItemOrder"));
        Assertions.assertThat(value.getLineItemOrder()).isEqualTo(Collections.singletonList("lineItemOrder"));
    }
}
