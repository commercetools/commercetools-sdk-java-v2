
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryCreatedMessageBuilder builder) {
        InventoryEntryCreatedMessage inventoryEntryCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryCreatedMessage).isInstanceOf(InventoryEntryCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "inventoryEntry", InventoryEntryCreatedMessage.builder()
                .inventoryEntry(new com.commercetools.api.models.inventory.InventoryEntryImpl()) } };
    }

    @Test
    public void inventoryEntry() {
        InventoryEntryCreatedMessage value = InventoryEntryCreatedMessage.of();
        value.setInventoryEntry(new com.commercetools.api.models.inventory.InventoryEntryImpl());
        Assertions.assertThat(value.getInventoryEntry())
                .isEqualTo(new com.commercetools.api.models.inventory.InventoryEntryImpl());
    }
}
