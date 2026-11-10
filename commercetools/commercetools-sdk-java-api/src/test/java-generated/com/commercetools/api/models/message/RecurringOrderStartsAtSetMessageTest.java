
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderStartsAtSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderStartsAtSetMessageBuilder builder) {
        RecurringOrderStartsAtSetMessage recurringOrderStartsAtSetMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderStartsAtSetMessage).isInstanceOf(RecurringOrderStartsAtSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "startsAt",
                        RecurringOrderStartsAtSetMessage.builder().startsAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "oldStartsAt", RecurringOrderStartsAtSetMessage.builder()
                        .oldStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void startsAt() {
        RecurringOrderStartsAtSetMessage value = RecurringOrderStartsAtSetMessage.of();
        value.setStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getStartsAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void oldStartsAt() {
        RecurringOrderStartsAtSetMessage value = RecurringOrderStartsAtSetMessage.of();
        value.setOldStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getOldStartsAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
