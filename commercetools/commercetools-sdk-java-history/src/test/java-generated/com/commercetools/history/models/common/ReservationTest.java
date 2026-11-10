
package com.commercetools.history.models.common;

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
        return new Object[][] { new Object[] { "quantity", Reservation.builder().quantity(8) },
                new Object[] { "owner",
                        Reservation.builder().owner(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "createdAt", Reservation.builder().createdAt("createdAt") },
                new Object[] { "checkoutStartedAt", Reservation.builder().checkoutStartedAt("checkoutStartedAt") } };
    }

    @Test
    public void quantity() {
        Reservation value = Reservation.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }

    @Test
    public void owner() {
        Reservation value = Reservation.of();
        value.setOwner(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getOwner()).isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void createdAt() {
        Reservation value = Reservation.of();
        value.setCreatedAt("createdAt");
        Assertions.assertThat(value.getCreatedAt()).isEqualTo("createdAt");
    }

    @Test
    public void checkoutStartedAt() {
        Reservation value = Reservation.of();
        value.setCheckoutStartedAt("checkoutStartedAt");
        Assertions.assertThat(value.getCheckoutStartedAt()).isEqualTo("checkoutStartedAt");
    }
}
