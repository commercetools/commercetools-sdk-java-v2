
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomFieldAddedMessageBuilder builder) {
        RecurringOrderCustomFieldAddedMessage recurringOrderCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderCustomFieldAddedMessage)
                .isInstanceOf(RecurringOrderCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", RecurringOrderCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", RecurringOrderCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        RecurringOrderCustomFieldAddedMessage value = RecurringOrderCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        RecurringOrderCustomFieldAddedMessage value = RecurringOrderCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
