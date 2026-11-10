
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomTypeRemovedMessagePayloadBuilder builder) {
        RecurringOrderCustomTypeRemovedMessagePayload recurringOrderCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(recurringOrderCustomTypeRemovedMessagePayload)
                .isInstanceOf(RecurringOrderCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "previousTypeId",
                RecurringOrderCustomTypeRemovedMessagePayload.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void previousTypeId() {
        RecurringOrderCustomTypeRemovedMessagePayload value = RecurringOrderCustomTypeRemovedMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
