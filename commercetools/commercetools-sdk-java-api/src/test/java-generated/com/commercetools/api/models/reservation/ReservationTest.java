
package com.commercetools.api.models.reservation;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReservationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReservationBuilder builder) {
        Reservation reservation = builder.buildUnchecked();
        Assertions.assertThat(reservation).isInstanceOf(Reservation.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Reservation.builder().id("id") },
                new Object[] { "version", Reservation.builder().version(2L) },
                new Object[] { "createdAt", Reservation.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Reservation.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "expiresAt", Reservation.builder().expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Reservation.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Reservation.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "inventoryEntry", Reservation.builder()
                        .inventoryEntry(new com.commercetools.api.models.inventory.InventoryEntryReferenceImpl()) },
                new Object[] { "quantity", Reservation.builder().quantity(8L) },
                new Object[] { "owner",
                        Reservation.builder().owner(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { "lineItemId", Reservation.builder().lineItemId("lineItemId") },
                new Object[] { "state", Reservation.builder()
                        .state(com.commercetools.api.models.reservation.ReservationState.findEnum("Created")) } };
    }

    @Test
    public void id() {
        Reservation value = Reservation.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Reservation value = Reservation.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Reservation value = Reservation.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Reservation value = Reservation.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void expiresAt() {
        Reservation value = Reservation.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Reservation value = Reservation.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Reservation value = Reservation.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void inventoryEntry() {
        Reservation value = Reservation.of();
        value.setInventoryEntry(new com.commercetools.api.models.inventory.InventoryEntryReferenceImpl());
        Assertions.assertThat(value.getInventoryEntry())
                .isEqualTo(new com.commercetools.api.models.inventory.InventoryEntryReferenceImpl());
    }

    @Test
    public void quantity() {
        Reservation value = Reservation.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void owner() {
        Reservation value = Reservation.of();
        value.setOwner(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getOwner()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void lineItemId() {
        Reservation value = Reservation.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void state() {
        Reservation value = Reservation.of();
        value.setState(com.commercetools.api.models.reservation.ReservationState.findEnum("Created"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.reservation.ReservationState.findEnum("Created"));
    }
}
