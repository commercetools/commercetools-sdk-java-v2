
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectSetReleaseExpiredReservationsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectSetReleaseExpiredReservationsActionBuilder builder) {
        ProjectSetReleaseExpiredReservationsAction projectSetReleaseExpiredReservationsAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectSetReleaseExpiredReservationsAction)
                .isInstanceOf(ProjectSetReleaseExpiredReservationsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "releaseExpiredReservations",
                ProjectSetReleaseExpiredReservationsAction.builder().releaseExpiredReservations(true) } };
    }

    @Test
    public void releaseExpiredReservations() {
        ProjectSetReleaseExpiredReservationsAction value = ProjectSetReleaseExpiredReservationsAction.of();
        value.setReleaseExpiredReservations(true);
        Assertions.assertThat(value.getReleaseExpiredReservations()).isEqualTo(true);
    }
}
