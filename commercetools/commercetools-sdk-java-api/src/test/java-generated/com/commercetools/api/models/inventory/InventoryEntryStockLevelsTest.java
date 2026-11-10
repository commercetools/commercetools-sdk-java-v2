
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryStockLevelsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryStockLevelsBuilder builder) {
        InventoryEntryStockLevels inventoryEntryStockLevels = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryStockLevels).isInstanceOf(InventoryEntryStockLevels.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reorderPoint", InventoryEntryStockLevels.builder().reorderPoint(8) },
                new Object[] { "safetyStock", InventoryEntryStockLevels.builder().safetyStock(3) } };
    }

    @Test
    public void reorderPoint() {
        InventoryEntryStockLevels value = InventoryEntryStockLevels.of();
        value.setReorderPoint(8);
        Assertions.assertThat(value.getReorderPoint()).isEqualTo(8);
    }

    @Test
    public void safetyStock() {
        InventoryEntryStockLevels value = InventoryEntryStockLevels.of();
        value.setSafetyStock(3);
        Assertions.assertThat(value.getSafetyStock()).isEqualTo(3);
    }
}
