
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderSetCustomFieldActionBuilder builder) {
        RecurringOrderSetCustomFieldAction recurringOrderSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderSetCustomFieldAction)
                .isInstanceOf(RecurringOrderSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", RecurringOrderSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", RecurringOrderSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        RecurringOrderSetCustomFieldAction value = RecurringOrderSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        RecurringOrderSetCustomFieldAction value = RecurringOrderSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
