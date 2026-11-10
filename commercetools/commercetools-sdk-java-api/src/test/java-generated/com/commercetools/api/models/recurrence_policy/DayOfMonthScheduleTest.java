
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DayOfMonthScheduleTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DayOfMonthScheduleBuilder builder) {
        DayOfMonthSchedule dayOfMonthSchedule = builder.buildUnchecked();
        Assertions.assertThat(dayOfMonthSchedule).isInstanceOf(DayOfMonthSchedule.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "day", DayOfMonthSchedule.builder().day(5) } };
    }

    @Test
    public void day() {
        DayOfMonthSchedule value = DayOfMonthSchedule.of();
        value.setDay(5);
        Assertions.assertThat(value.getDay()).isEqualTo(5);
    }
}
