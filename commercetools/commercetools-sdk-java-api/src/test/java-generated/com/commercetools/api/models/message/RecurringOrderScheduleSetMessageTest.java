
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderScheduleSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderScheduleSetMessageBuilder builder) {
        RecurringOrderScheduleSetMessage recurringOrderScheduleSetMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderScheduleSetMessage).isInstanceOf(RecurringOrderScheduleSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "recurrencePolicySchedule", RecurringOrderScheduleSetMessage.builder()
                        .recurrencePolicySchedule(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl()) },
                new Object[] { "oldRecurrencePolicySchedule", RecurringOrderScheduleSetMessage.builder()
                        .oldRecurrencePolicySchedule(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl()) } };
    }

    @Test
    public void recurrencePolicySchedule() {
        RecurringOrderScheduleSetMessage value = RecurringOrderScheduleSetMessage.of();
        value.setRecurrencePolicySchedule(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
        Assertions.assertThat(value.getRecurrencePolicySchedule())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
    }

    @Test
    public void oldRecurrencePolicySchedule() {
        RecurringOrderScheduleSetMessage value = RecurringOrderScheduleSetMessage.of();
        value.setOldRecurrencePolicySchedule(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
        Assertions.assertThat(value.getOldRecurrencePolicySchedule())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
    }
}
