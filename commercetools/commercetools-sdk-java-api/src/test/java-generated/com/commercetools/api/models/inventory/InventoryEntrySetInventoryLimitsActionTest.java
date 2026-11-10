
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySetInventoryLimitsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySetInventoryLimitsActionBuilder builder) {
        InventoryEntrySetInventoryLimitsAction inventoryEntrySetInventoryLimitsAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetInventoryLimitsAction)
                .isInstanceOf(InventoryEntrySetInventoryLimitsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "minCartQuantity",
                        InventoryEntrySetInventoryLimitsAction.builder().minCartQuantity(6L) },
                new Object[] { "maxCartQuantity",
                        InventoryEntrySetInventoryLimitsAction.builder().maxCartQuantity(4L) } };
    }

    @Test
    public void minCartQuantity() {
        InventoryEntrySetInventoryLimitsAction value = InventoryEntrySetInventoryLimitsAction.of();
        value.setMinCartQuantity(6L);
        Assertions.assertThat(value.getMinCartQuantity()).isEqualTo(6L);
    }

    @Test
    public void maxCartQuantity() {
        InventoryEntrySetInventoryLimitsAction value = InventoryEntrySetInventoryLimitsAction.of();
        value.setMaxCartQuantity(4L);
        Assertions.assertThat(value.getMaxCartQuantity()).isEqualTo(4L);
    }
}
