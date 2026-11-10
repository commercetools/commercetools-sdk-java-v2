
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryReservationExpirationInMinutesSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryEntryReservationExpirationInMinutesSetMessageBuilder builder) {
        InventoryEntryReservationExpirationInMinutesSetMessage inventoryEntryReservationExpirationInMinutesSetMessage = builder
                .buildUnchecked();
        Assertions.assertThat(inventoryEntryReservationExpirationInMinutesSetMessage)
                .isInstanceOf(InventoryEntryReservationExpirationInMinutesSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "newReservationExpirationInMinutes",
                        InventoryEntryReservationExpirationInMinutesSetMessage.builder()
                                .newReservationExpirationInMinutes(5) },
                new Object[] { "oldReservationExpirationInMinutes",
                        InventoryEntryReservationExpirationInMinutesSetMessage.builder()
                                .oldReservationExpirationInMinutes(2) } };
    }

    @Test
    public void newReservationExpirationInMinutes() {
        InventoryEntryReservationExpirationInMinutesSetMessage value = InventoryEntryReservationExpirationInMinutesSetMessage
                .of();
        value.setNewReservationExpirationInMinutes(5);
        Assertions.assertThat(value.getNewReservationExpirationInMinutes()).isEqualTo(5);
    }

    @Test
    public void oldReservationExpirationInMinutes() {
        InventoryEntryReservationExpirationInMinutesSetMessage value = InventoryEntryReservationExpirationInMinutesSetMessage
                .of();
        value.setOldReservationExpirationInMinutes(2);
        Assertions.assertThat(value.getOldReservationExpirationInMinutes()).isEqualTo(2);
    }
}
