
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySetSafetyStockActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySetSafetyStockActionBuilder builder) {
        InventoryEntrySetSafetyStockAction inventoryEntrySetSafetyStockAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetSafetyStockAction)
                .isInstanceOf(InventoryEntrySetSafetyStockAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quantity", InventoryEntrySetSafetyStockAction.builder().quantity(8) } };
    }

    @Test
    public void quantity() {
        InventoryEntrySetSafetyStockAction value = InventoryEntrySetSafetyStockAction.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }
}
