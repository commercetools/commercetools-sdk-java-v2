
package com.commercetools.api.models.recurring_order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderSetStartsAtActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderSetStartsAtActionBuilder builder) {
        RecurringOrderSetStartsAtAction recurringOrderSetStartsAtAction = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderSetStartsAtAction).isInstanceOf(RecurringOrderSetStartsAtAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "startsAt",
                RecurringOrderSetStartsAtAction.builder().startsAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void startsAt() {
        RecurringOrderSetStartsAtAction value = RecurringOrderSetStartsAtAction.of();
        value.setStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getStartsAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
