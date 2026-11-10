
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryReferenceBuilder builder) {
        InventoryEntryReference inventoryEntryReference = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntryReference).isInstanceOf(InventoryEntryReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        InventoryEntryReference.builder()
                                .obj(new com.commercetools.api.models.inventory.InventoryEntryImpl()) },
                new Object[] { "id", InventoryEntryReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        InventoryEntryReference value = InventoryEntryReference.of();
        value.setObj(new com.commercetools.api.models.inventory.InventoryEntryImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.inventory.InventoryEntryImpl());
    }

    @Test
    public void id() {
        InventoryEntryReference value = InventoryEntryReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
