
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandardScheduleTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandardScheduleBuilder builder) {
        StandardSchedule standardSchedule = builder.buildUnchecked();
        Assertions.assertThat(standardSchedule).isInstanceOf(StandardSchedule.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", StandardSchedule.builder().value(6L) },
                new Object[] { "intervalUnit", StandardSchedule.builder()
                        .intervalUnit(com.commercetools.api.models.recurrence_policy.IntervalUnit.findEnum("Days")) } };
    }

    @Test
    public void value() {
        StandardSchedule value = StandardSchedule.of();
        value.setValue(6L);
        Assertions.assertThat(value.getValue()).isEqualTo(6L);
    }

    @Test
    public void intervalUnit() {
        StandardSchedule value = StandardSchedule.of();
        value.setIntervalUnit(com.commercetools.api.models.recurrence_policy.IntervalUnit.findEnum("Days"));
        Assertions.assertThat(value.getIntervalUnit())
                .isEqualTo(com.commercetools.api.models.recurrence_policy.IntervalUnit.findEnum("Days"));
    }
}
