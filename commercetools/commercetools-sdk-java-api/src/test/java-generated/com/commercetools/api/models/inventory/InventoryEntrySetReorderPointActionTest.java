
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySetReorderPointActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySetReorderPointActionBuilder builder) {
        InventoryEntrySetReorderPointAction inventoryEntrySetReorderPointAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetReorderPointAction)
                .isInstanceOf(InventoryEntrySetReorderPointAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quantity", InventoryEntrySetReorderPointAction.builder().quantity(8) } };
    }

    @Test
    public void quantity() {
        InventoryEntrySetReorderPointAction value = InventoryEntrySetReorderPointAction.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }
}
