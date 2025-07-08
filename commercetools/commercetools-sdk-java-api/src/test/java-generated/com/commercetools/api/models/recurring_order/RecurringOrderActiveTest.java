
package com.commercetools.api.models.recurring_order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderActiveTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderActiveBuilder builder) {
        RecurringOrderActive recurringOrderActive = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderActive).isInstanceOf(RecurringOrderActive.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resumesAt",
                RecurringOrderActive.builder().resumesAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void resumesAt() {
        RecurringOrderActive value = RecurringOrderActive.of();
        value.setResumesAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getResumesAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
