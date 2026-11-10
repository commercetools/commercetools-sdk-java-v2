
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderExpiresAtSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderExpiresAtSetMessagePayloadBuilder builder) {
        RecurringOrderExpiresAtSetMessagePayload recurringOrderExpiresAtSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderExpiresAtSetMessagePayload)
                .isInstanceOf(RecurringOrderExpiresAtSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "newExpiresAt",
                        RecurringOrderExpiresAtSetMessagePayload.builder()
                                .newExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "oldExpiresAt", RecurringOrderExpiresAtSetMessagePayload.builder()
                        .oldExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void newExpiresAt() {
        RecurringOrderExpiresAtSetMessagePayload value = RecurringOrderExpiresAtSetMessagePayload.of();
        value.setNewExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getNewExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void oldExpiresAt() {
        RecurringOrderExpiresAtSetMessagePayload value = RecurringOrderExpiresAtSetMessagePayload.of();
        value.setOldExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getOldExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
