
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderSetKeyActionBuilder builder) {
        RecurringOrderSetKeyAction recurringOrderSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderSetKeyAction).isInstanceOf(RecurringOrderSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurringOrderSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        RecurringOrderSetKeyAction value = RecurringOrderSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
