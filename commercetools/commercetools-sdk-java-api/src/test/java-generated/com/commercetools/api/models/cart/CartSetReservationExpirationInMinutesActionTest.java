
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetReservationExpirationInMinutesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetReservationExpirationInMinutesActionBuilder builder) {
        CartSetReservationExpirationInMinutesAction cartSetReservationExpirationInMinutesAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetReservationExpirationInMinutesAction)
                .isInstanceOf(CartSetReservationExpirationInMinutesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reservationExpirationInMinutes",
                CartSetReservationExpirationInMinutesAction.builder().reservationExpirationInMinutes(4) } };
    }

    @Test
    public void reservationExpirationInMinutes() {
        CartSetReservationExpirationInMinutesAction value = CartSetReservationExpirationInMinutesAction.of();
        value.setReservationExpirationInMinutes(4);
        Assertions.assertThat(value.getReservationExpirationInMinutes()).isEqualTo(4);
    }
}
