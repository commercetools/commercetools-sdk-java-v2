
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySetKeyActionBuilder builder) {
        InventoryEntrySetKeyAction inventoryEntrySetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetKeyAction).isInstanceOf(InventoryEntrySetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", InventoryEntrySetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        InventoryEntrySetKeyAction value = InventoryEntrySetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
