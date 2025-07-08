
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomTypeRemovedMessageBuilder builder) {
        RecurringOrderCustomTypeRemovedMessage recurringOrderCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderCustomTypeRemovedMessage)
                .isInstanceOf(RecurringOrderCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "previousTypeId",
                RecurringOrderCustomTypeRemovedMessage.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void previousTypeId() {
        RecurringOrderCustomTypeRemovedMessage value = RecurringOrderCustomTypeRemovedMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
