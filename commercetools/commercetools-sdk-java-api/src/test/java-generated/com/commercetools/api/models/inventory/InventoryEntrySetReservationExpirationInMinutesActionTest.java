
package com.commercetools.api.models.inventory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntrySetReservationExpirationInMinutesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntrySetReservationExpirationInMinutesActionBuilder builder) {
        InventoryEntrySetReservationExpirationInMinutesAction inventoryEntrySetReservationExpirationInMinutesAction = builder
                .buildUnchecked();
        Assertions.assertThat(inventoryEntrySetReservationExpirationInMinutesAction)
                .isInstanceOf(InventoryEntrySetReservationExpirationInMinutesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reservationExpirationInMinutes",
                InventoryEntrySetReservationExpirationInMinutesAction.builder().reservationExpirationInMinutes(4) } };
    }

    @Test
    public void reservationExpirationInMinutes() {
        InventoryEntrySetReservationExpirationInMinutesAction value = InventoryEntrySetReservationExpirationInMinutesAction
                .of();
        value.setReservationExpirationInMinutes(4);
        Assertions.assertThat(value.getReservationExpirationInMinutes()).isEqualTo(4);
    }
}
