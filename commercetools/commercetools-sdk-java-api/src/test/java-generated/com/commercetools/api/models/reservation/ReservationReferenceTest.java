
package com.commercetools.api.models.reservation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReservationReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReservationReferenceBuilder builder) {
        ReservationReference reservationReference = builder.buildUnchecked();
        Assertions.assertThat(reservationReference).isInstanceOf(ReservationReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        ReservationReference.builder()
                                .obj(new com.commercetools.api.models.reservation.ReservationImpl()) },
                new Object[] { "id", ReservationReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ReservationReference value = ReservationReference.of();
        value.setObj(new com.commercetools.api.models.reservation.ReservationImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.reservation.ReservationImpl());
    }

    @Test
    public void id() {
        ReservationReference value = ReservationReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
