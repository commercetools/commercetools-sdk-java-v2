
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomFieldChangedMessageBuilder builder) {
        RecurringOrderCustomFieldChangedMessage recurringOrderCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderCustomFieldChangedMessage)
                .isInstanceOf(RecurringOrderCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", RecurringOrderCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", RecurringOrderCustomFieldChangedMessage.builder().value("value") },
                new Object[] { "previousValue",
                        RecurringOrderCustomFieldChangedMessage.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        RecurringOrderCustomFieldChangedMessage value = RecurringOrderCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        RecurringOrderCustomFieldChangedMessage value = RecurringOrderCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        RecurringOrderCustomFieldChangedMessage value = RecurringOrderCustomFieldChangedMessage.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
