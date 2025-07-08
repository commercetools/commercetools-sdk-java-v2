
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicySetScheduleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicySetScheduleActionBuilder builder) {
        RecurrencePolicySetScheduleAction recurrencePolicySetScheduleAction = builder.buildUnchecked();
        Assertions.assertThat(recurrencePolicySetScheduleAction).isInstanceOf(RecurrencePolicySetScheduleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "schedule", RecurrencePolicySetScheduleAction.builder()
                .schedule(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftImpl()) } };
    }

    @Test
    public void schedule() {
        RecurrencePolicySetScheduleAction value = RecurrencePolicySetScheduleAction.of();
        value.setSchedule(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftImpl());
        Assertions.assertThat(value.getSchedule())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftImpl());
    }
}
