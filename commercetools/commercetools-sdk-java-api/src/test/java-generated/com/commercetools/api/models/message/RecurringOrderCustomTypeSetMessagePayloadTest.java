
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCustomTypeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCustomTypeSetMessagePayloadBuilder builder) {
        RecurringOrderCustomTypeSetMessagePayload recurringOrderCustomTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderCustomTypeSetMessagePayload)
                .isInstanceOf(RecurringOrderCustomTypeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        RecurringOrderCustomTypeSetMessagePayload.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "previousTypeId",
                        RecurringOrderCustomTypeSetMessagePayload.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void customFields() {
        RecurringOrderCustomTypeSetMessagePayload value = RecurringOrderCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        RecurringOrderCustomTypeSetMessagePayload value = RecurringOrderCustomTypeSetMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
