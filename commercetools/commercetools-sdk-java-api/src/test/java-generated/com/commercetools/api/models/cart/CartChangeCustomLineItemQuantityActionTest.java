
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangeCustomLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangeCustomLineItemQuantityActionBuilder builder) {
        CartChangeCustomLineItemQuantityAction cartChangeCustomLineItemQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeCustomLineItemQuantityAction)
                .isInstanceOf(CartChangeCustomLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartChangeCustomLineItemQuantityAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartChangeCustomLineItemQuantityAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "quantity", CartChangeCustomLineItemQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void customLineItemId() {
        CartChangeCustomLineItemQuantityAction value = CartChangeCustomLineItemQuantityAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartChangeCustomLineItemQuantityAction value = CartChangeCustomLineItemQuantityAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        CartChangeCustomLineItemQuantityAction value = CartChangeCustomLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
