
package com.commercetools.api.models.inventory;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryUpdateBuilder builder) {
        InventoryEntryUpdate inventoryEntryUpdate = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryUpdate).isInstanceOf(InventoryEntryUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", InventoryEntryUpdate.builder().version(2L) },
                new Object[] { "actions",
                        InventoryEntryUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.inventory.InventoryEntryUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        InventoryEntryUpdate value = InventoryEntryUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        InventoryEntryUpdate value = InventoryEntryUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.inventory.InventoryEntryUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.inventory.InventoryEntryUpdateActionImpl()));
    }
}
