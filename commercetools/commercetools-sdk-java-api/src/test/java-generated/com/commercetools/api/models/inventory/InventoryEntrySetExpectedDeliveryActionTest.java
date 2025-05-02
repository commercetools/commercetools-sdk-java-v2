
package com.commercetools.api.models.inventory;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySetExpectedDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySetExpectedDeliveryActionBuilder builder) {
        InventoryEntrySetExpectedDeliveryAction inventoryEntrySetExpectedDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(inventoryEntrySetExpectedDeliveryAction)
                .isInstanceOf(InventoryEntrySetExpectedDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "expectedDelivery", InventoryEntrySetExpectedDeliveryAction.builder()
                .expectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void expectedDelivery() {
        InventoryEntrySetExpectedDeliveryAction value = InventoryEntrySetExpectedDeliveryAction.of();
        value.setExpectedDelivery(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpectedDelivery()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
