
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomFieldRemovedMessagePayloadBuilder builder) {
        RecurringOrderCustomFieldRemovedMessagePayload recurringOrderCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(recurringOrderCustomFieldRemovedMessagePayload)
                .isInstanceOf(RecurringOrderCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", RecurringOrderCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        RecurringOrderCustomFieldRemovedMessagePayload value = RecurringOrderCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
