
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomFieldAddedMessagePayloadBuilder builder) {
        RecurringOrderCustomFieldAddedMessagePayload recurringOrderCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(recurringOrderCustomFieldAddedMessagePayload)
                .isInstanceOf(RecurringOrderCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", RecurringOrderCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", RecurringOrderCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        RecurringOrderCustomFieldAddedMessagePayload value = RecurringOrderCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        RecurringOrderCustomFieldAddedMessagePayload value = RecurringOrderCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
