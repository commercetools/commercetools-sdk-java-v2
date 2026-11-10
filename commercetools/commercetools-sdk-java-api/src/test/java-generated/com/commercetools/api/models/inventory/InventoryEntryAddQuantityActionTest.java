
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryAddQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryAddQuantityActionBuilder builder) {
        InventoryEntryAddQuantityAction inventoryEntryAddQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryAddQuantityAction).isInstanceOf(InventoryEntryAddQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quantity", InventoryEntryAddQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void quantity() {
        InventoryEntryAddQuantityAction value = InventoryEntryAddQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
