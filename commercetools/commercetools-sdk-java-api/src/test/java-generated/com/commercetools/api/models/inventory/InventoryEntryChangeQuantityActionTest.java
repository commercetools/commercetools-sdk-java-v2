
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryChangeQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryChangeQuantityActionBuilder builder) {
        InventoryEntryChangeQuantityAction inventoryEntryChangeQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryChangeQuantityAction)
                .isInstanceOf(InventoryEntryChangeQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quantity", InventoryEntryChangeQuantityAction.builder().quantity(8L) } };
    }

    @Test
    public void quantity() {
        InventoryEntryChangeQuantityAction value = InventoryEntryChangeQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
