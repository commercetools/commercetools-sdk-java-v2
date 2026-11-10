
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryResourceIdentifierBuilder builder) {
        InventoryEntryResourceIdentifier inventoryEntryResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryResourceIdentifier).isInstanceOf(InventoryEntryResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", InventoryEntryResourceIdentifier.builder().id("id") },
                new Object[] { "key", InventoryEntryResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        InventoryEntryResourceIdentifier value = InventoryEntryResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        InventoryEntryResourceIdentifier value = InventoryEntryResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
