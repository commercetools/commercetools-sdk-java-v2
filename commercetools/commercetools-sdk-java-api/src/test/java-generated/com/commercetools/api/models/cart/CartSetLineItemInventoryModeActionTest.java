
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemInventoryModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemInventoryModeActionBuilder builder) {
        CartSetLineItemInventoryModeAction cartSetLineItemInventoryModeAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemInventoryModeAction)
                .isInstanceOf(CartSetLineItemInventoryModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemInventoryModeAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartSetLineItemInventoryModeAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "inventoryMode", CartSetLineItemInventoryModeAction.builder()
                        .inventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None")) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemInventoryModeAction value = CartSetLineItemInventoryModeAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemInventoryModeAction value = CartSetLineItemInventoryModeAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void inventoryMode() {
        CartSetLineItemInventoryModeAction value = CartSetLineItemInventoryModeAction.of();
        value.setInventoryMode(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
        Assertions.assertThat(value.getInventoryMode())
                .isEqualTo(com.commercetools.api.models.cart.InventoryMode.findEnum("None"));
    }
}
