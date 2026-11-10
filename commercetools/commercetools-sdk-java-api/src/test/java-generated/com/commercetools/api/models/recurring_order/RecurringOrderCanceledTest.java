
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCanceledTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCanceledBuilder builder) {
        RecurringOrderCanceled recurringOrderCanceled = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderCanceled).isInstanceOf(RecurringOrderCanceled.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reason", RecurringOrderCanceled.builder().reason("reason") } };
    }

    @Test
    public void reason() {
        RecurringOrderCanceled value = RecurringOrderCanceled.of();
        value.setReason("reason");
        Assertions.assertThat(value.getReason()).isEqualTo("reason");
    }
}
