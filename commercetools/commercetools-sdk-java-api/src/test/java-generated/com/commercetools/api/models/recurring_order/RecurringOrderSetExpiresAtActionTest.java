
package com.commercetools.api.models.recurring_order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderSetExpiresAtActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderSetExpiresAtActionBuilder builder) {
        RecurringOrderSetExpiresAtAction recurringOrderSetExpiresAtAction = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderSetExpiresAtAction).isInstanceOf(RecurringOrderSetExpiresAtAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "expiresAt",
                RecurringOrderSetExpiresAtAction.builder().expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void expiresAt() {
        RecurringOrderSetExpiresAtAction value = RecurringOrderSetExpiresAtAction.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
