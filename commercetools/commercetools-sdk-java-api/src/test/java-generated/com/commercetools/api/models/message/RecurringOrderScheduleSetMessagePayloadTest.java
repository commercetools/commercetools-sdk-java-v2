
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderScheduleSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderScheduleSetMessagePayloadBuilder builder) {
        RecurringOrderScheduleSetMessagePayload recurringOrderScheduleSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderScheduleSetMessagePayload)
                .isInstanceOf(RecurringOrderScheduleSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "recurrencePolicySchedule", RecurringOrderScheduleSetMessagePayload.builder()
                        .recurrencePolicySchedule(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl()) },
                new Object[] { "oldRecurrencePolicySchedule", RecurringOrderScheduleSetMessagePayload.builder()
                        .oldRecurrencePolicySchedule(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl()) } };
    }

    @Test
    public void recurrencePolicySchedule() {
        RecurringOrderScheduleSetMessagePayload value = RecurringOrderScheduleSetMessagePayload.of();
        value.setRecurrencePolicySchedule(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
        Assertions.assertThat(value.getRecurrencePolicySchedule())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
    }

    @Test
    public void oldRecurrencePolicySchedule() {
        RecurringOrderScheduleSetMessagePayload value = RecurringOrderScheduleSetMessagePayload.of();
        value.setOldRecurrencePolicySchedule(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
        Assertions.assertThat(value.getOldRecurrencePolicySchedule())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
    }
}
