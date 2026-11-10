
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryRemoveQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryRemoveQuantityActionBuilder builder) {
        InventoryEntryRemoveQuantityAction inventoryEntryRemoveQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryRemoveQuantityAction)
                .isInstanceOf(InventoryEntryRemoveQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quantity", InventoryEntryRemoveQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void quantity() {
        InventoryEntryRemoveQuantityAction value = InventoryEntryRemoveQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
