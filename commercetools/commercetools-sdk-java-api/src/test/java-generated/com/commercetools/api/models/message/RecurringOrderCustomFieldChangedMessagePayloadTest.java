
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomFieldChangedMessagePayloadBuilder builder) {
        RecurringOrderCustomFieldChangedMessagePayload recurringOrderCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(recurringOrderCustomFieldChangedMessagePayload)
                .isInstanceOf(RecurringOrderCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", RecurringOrderCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", RecurringOrderCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "previousValue",
                        RecurringOrderCustomFieldChangedMessagePayload.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        RecurringOrderCustomFieldChangedMessagePayload value = RecurringOrderCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        RecurringOrderCustomFieldChangedMessagePayload value = RecurringOrderCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        RecurringOrderCustomFieldChangedMessagePayload value = RecurringOrderCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
