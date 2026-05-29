
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectSetReservationExpirationInMinutesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectSetReservationExpirationInMinutesActionBuilder builder) {
        ProjectSetReservationExpirationInMinutesAction projectSetReservationExpirationInMinutesAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectSetReservationExpirationInMinutesAction)
                .isInstanceOf(ProjectSetReservationExpirationInMinutesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reservationExpirationInMinutes",
                ProjectSetReservationExpirationInMinutesAction.builder().reservationExpirationInMinutes(4) } };
    }

    @Test
    public void reservationExpirationInMinutes() {
        ProjectSetReservationExpirationInMinutesAction value = ProjectSetReservationExpirationInMinutesAction.of();
        value.setReservationExpirationInMinutes(4);
        Assertions.assertThat(value.getReservationExpirationInMinutes()).isEqualTo(4);
    }
}
