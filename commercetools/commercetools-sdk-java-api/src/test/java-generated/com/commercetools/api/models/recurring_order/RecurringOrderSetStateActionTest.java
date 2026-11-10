
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderSetStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderSetStateActionBuilder builder) {
        RecurringOrderSetStateAction recurringOrderSetStateAction = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderSetStateAction).isInstanceOf(RecurringOrderSetStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurringOrderState",
                RecurringOrderSetStateAction.builder()
                        .recurringOrderState(
                            new com.commercetools.api.models.recurring_order.RecurringOrderStateDraftImpl()) } };
    }

    @Test
    public void recurringOrderState() {
        RecurringOrderSetStateAction value = RecurringOrderSetStateAction.of();
        value.setRecurringOrderState(new com.commercetools.api.models.recurring_order.RecurringOrderStateDraftImpl());
        Assertions.assertThat(value.getRecurringOrderState())
                .isEqualTo(new com.commercetools.api.models.recurring_order.RecurringOrderStateDraftImpl());
    }
}
