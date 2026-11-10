
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderExpiresAtSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderExpiresAtSetMessageBuilder builder) {
        RecurringOrderExpiresAtSetMessage recurringOrderExpiresAtSetMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderExpiresAtSetMessage).isInstanceOf(RecurringOrderExpiresAtSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "newExpiresAt",
                        RecurringOrderExpiresAtSetMessage.builder()
                                .newExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "oldExpiresAt", RecurringOrderExpiresAtSetMessage.builder()
                        .oldExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void newExpiresAt() {
        RecurringOrderExpiresAtSetMessage value = RecurringOrderExpiresAtSetMessage.of();
        value.setNewExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getNewExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void oldExpiresAt() {
        RecurringOrderExpiresAtSetMessage value = RecurringOrderExpiresAtSetMessage.of();
        value.setOldExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getOldExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
