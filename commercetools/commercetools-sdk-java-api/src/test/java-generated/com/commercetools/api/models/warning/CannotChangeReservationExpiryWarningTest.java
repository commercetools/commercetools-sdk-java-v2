
package com.commercetools.api.models.warning;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CannotChangeReservationExpiryWarningTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CannotChangeReservationExpiryWarningBuilder builder) {
        CannotChangeReservationExpiryWarning cannotChangeReservationExpiryWarning = builder.buildUnchecked();
        Assertions.assertThat(cannotChangeReservationExpiryWarning)
                .isInstanceOf(CannotChangeReservationExpiryWarning.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", CannotChangeReservationExpiryWarning.builder().message("message") },
                new Object[] { "lineItemId",
                        CannotChangeReservationExpiryWarning.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void message() {
        CannotChangeReservationExpiryWarning value = CannotChangeReservationExpiryWarning.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void lineItemId() {
        CannotChangeReservationExpiryWarning value = CannotChangeReservationExpiryWarning.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
