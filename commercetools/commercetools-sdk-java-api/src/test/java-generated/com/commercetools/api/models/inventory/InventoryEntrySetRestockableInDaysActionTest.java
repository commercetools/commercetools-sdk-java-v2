
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySetRestockableInDaysActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySetRestockableInDaysActionBuilder builder) {
        InventoryEntrySetRestockableInDaysAction inventoryEntrySetRestockableInDaysAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetRestockableInDaysAction)
                .isInstanceOf(InventoryEntrySetRestockableInDaysAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "restockableInDays",
                InventoryEntrySetRestockableInDaysAction.builder().restockableInDays(4L) } };
    }

    @Test
    public void restockableInDays() {
        InventoryEntrySetRestockableInDaysAction value = InventoryEntrySetRestockableInDaysAction.of();
        value.setRestockableInDays(4L);
        Assertions.assertThat(value.getRestockableInDays()).isEqualTo(4L);
    }
}
