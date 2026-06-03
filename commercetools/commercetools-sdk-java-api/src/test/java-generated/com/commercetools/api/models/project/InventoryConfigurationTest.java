
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InventoryConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InventoryConfigurationBuilder builder) {
        InventoryConfiguration inventoryConfiguration = builder.buildUnchecked();
        Assertions.assertThat(inventoryConfiguration).isInstanceOf(InventoryConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "reservationExpirationInMinutes",
                        InventoryConfiguration.builder().reservationExpirationInMinutes(4) },
                new Object[] { "releaseExpiredReservations",
                        InventoryConfiguration.builder().releaseExpiredReservations(true) } };
    }

    @Test
    public void reservationExpirationInMinutes() {
        InventoryConfiguration value = InventoryConfiguration.of();
        value.setReservationExpirationInMinutes(4);
        Assertions.assertThat(value.getReservationExpirationInMinutes()).isEqualTo(4);
    }

    @Test
    public void releaseExpiredReservations() {
        InventoryConfiguration value = InventoryConfiguration.of();
        value.setReleaseExpiredReservations(true);
        Assertions.assertThat(value.getReleaseExpiredReservations()).isEqualTo(true);
    }
}
