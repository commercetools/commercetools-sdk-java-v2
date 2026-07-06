
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryEntryReservationExpirationInMinutesSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name,
            InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder builder) {
        InventoryEntryReservationExpirationInMinutesSetMessagePayload inventoryEntryReservationExpirationInMinutesSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(inventoryEntryReservationExpirationInMinutesSetMessagePayload)
                .isInstanceOf(InventoryEntryReservationExpirationInMinutesSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "newReservationExpirationInMinutes",
                        InventoryEntryReservationExpirationInMinutesSetMessagePayload.builder()
                                .newReservationExpirationInMinutes(5) },
                new Object[] { "oldReservationExpirationInMinutes",
                        InventoryEntryReservationExpirationInMinutesSetMessagePayload.builder()
                                .oldReservationExpirationInMinutes(2) } };
    }

    @Test
    public void newReservationExpirationInMinutes() {
        InventoryEntryReservationExpirationInMinutesSetMessagePayload value = InventoryEntryReservationExpirationInMinutesSetMessagePayload
                .of();
        value.setNewReservationExpirationInMinutes(5);
        Assertions.assertThat(value.getNewReservationExpirationInMinutes()).isEqualTo(5);
    }

    @Test
    public void oldReservationExpirationInMinutes() {
        InventoryEntryReservationExpirationInMinutesSetMessagePayload value = InventoryEntryReservationExpirationInMinutesSetMessagePayload
                .of();
        value.setOldReservationExpirationInMinutes(2);
        Assertions.assertThat(value.getOldReservationExpirationInMinutes()).isEqualTo(2);
    }
}
