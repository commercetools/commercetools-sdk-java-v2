
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DayOfMonthScheduleDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DayOfMonthScheduleDraftBuilder builder) {
        DayOfMonthScheduleDraft dayOfMonthScheduleDraft = builder.buildUnchecked();
        Assertions.assertThat(dayOfMonthScheduleDraft).isInstanceOf(DayOfMonthScheduleDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "day", DayOfMonthScheduleDraft.builder().day(5) } };
    }

    @Test
    public void day() {
        DayOfMonthScheduleDraft value = DayOfMonthScheduleDraft.of();
        value.setDay(5);
        Assertions.assertThat(value.getDay()).isEqualTo(5);
    }
}
