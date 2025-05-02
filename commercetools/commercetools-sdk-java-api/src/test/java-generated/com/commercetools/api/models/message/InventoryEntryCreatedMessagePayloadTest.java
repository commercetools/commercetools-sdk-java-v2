
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryCreatedMessagePayloadBuilder builder) {
        InventoryEntryCreatedMessagePayload inventoryEntryCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryCreatedMessagePayload)
                .isInstanceOf(InventoryEntryCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "inventoryEntry", InventoryEntryCreatedMessagePayload.builder()
                .inventoryEntry(new com.commercetools.api.models.inventory.InventoryEntryImpl()) } };
    }

    @Test
    public void inventoryEntry() {
        InventoryEntryCreatedMessagePayload value = InventoryEntryCreatedMessagePayload.of();
        value.setInventoryEntry(new com.commercetools.api.models.inventory.InventoryEntryImpl());
        Assertions.assertThat(value.getInventoryEntry())
                .isEqualTo(new com.commercetools.api.models.inventory.InventoryEntryImpl());
    }
}
