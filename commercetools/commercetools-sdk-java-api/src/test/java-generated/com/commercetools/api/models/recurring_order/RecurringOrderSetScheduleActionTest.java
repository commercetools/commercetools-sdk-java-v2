
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderSetScheduleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderSetScheduleActionBuilder builder) {
        RecurringOrderSetScheduleAction recurringOrderSetScheduleAction = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderSetScheduleAction).isInstanceOf(RecurringOrderSetScheduleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurrencePolicy", RecurringOrderSetScheduleAction.builder()
                .recurrencePolicy(
                    new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl()) } };
    }

    @Test
    public void recurrencePolicy() {
        RecurringOrderSetScheduleAction value = RecurringOrderSetScheduleAction.of();
        value.setRecurrencePolicy(
            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
        Assertions.assertThat(value.getRecurrencePolicy())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierImpl());
    }
}
