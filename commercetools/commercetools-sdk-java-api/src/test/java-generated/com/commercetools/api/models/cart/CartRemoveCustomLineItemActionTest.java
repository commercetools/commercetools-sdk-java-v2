
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartRemoveCustomLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartRemoveCustomLineItemActionBuilder builder) {
        CartRemoveCustomLineItemAction cartRemoveCustomLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(cartRemoveCustomLineItemAction).isInstanceOf(CartRemoveCustomLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartRemoveCustomLineItemAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartRemoveCustomLineItemAction.builder().customLineItemKey("customLineItemKey") } };
    }

    @Test
    public void customLineItemId() {
        CartRemoveCustomLineItemAction value = CartRemoveCustomLineItemAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartRemoveCustomLineItemAction value = CartRemoveCustomLineItemAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }
}
