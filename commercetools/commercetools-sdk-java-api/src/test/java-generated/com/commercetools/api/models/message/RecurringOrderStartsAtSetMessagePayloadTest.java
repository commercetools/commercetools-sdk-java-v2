
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderStartsAtSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderStartsAtSetMessagePayloadBuilder builder) {
        RecurringOrderStartsAtSetMessagePayload recurringOrderStartsAtSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderStartsAtSetMessagePayload)
                .isInstanceOf(RecurringOrderStartsAtSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "startsAt",
                        RecurringOrderStartsAtSetMessagePayload.builder()
                                .startsAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "oldStartsAt", RecurringOrderStartsAtSetMessagePayload.builder()
                        .oldStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void startsAt() {
        RecurringOrderStartsAtSetMessagePayload value = RecurringOrderStartsAtSetMessagePayload.of();
        value.setStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getStartsAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void oldStartsAt() {
        RecurringOrderStartsAtSetMessagePayload value = RecurringOrderStartsAtSetMessagePayload.of();
        value.setOldStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getOldStartsAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
