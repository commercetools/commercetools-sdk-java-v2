
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderRequestOrderNowActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderRequestOrderNowActionBuilder builder) {
        RecurringOrderRequestOrderNowAction recurringOrderRequestOrderNowAction = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderRequestOrderNowAction)
                .isInstanceOf(RecurringOrderRequestOrderNowAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "reason", RecurringOrderRequestOrderNowAction.builder().reason("reason") } };
    }

    @Test
    public void reason() {
        RecurringOrderRequestOrderNowAction value = RecurringOrderRequestOrderNowAction.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }
}
