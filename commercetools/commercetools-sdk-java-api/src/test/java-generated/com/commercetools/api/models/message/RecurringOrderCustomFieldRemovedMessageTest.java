
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomFieldRemovedMessageBuilder builder) {
        RecurringOrderCustomFieldRemovedMessage recurringOrderCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderCustomFieldRemovedMessage)
                .isInstanceOf(RecurringOrderCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", RecurringOrderCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        RecurringOrderCustomFieldRemovedMessage value = RecurringOrderCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
