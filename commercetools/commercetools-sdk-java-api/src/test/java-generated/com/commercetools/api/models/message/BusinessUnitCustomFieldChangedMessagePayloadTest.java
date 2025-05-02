
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomFieldChangedMessagePayloadBuilder builder) {
        BusinessUnitCustomFieldChangedMessagePayload businessUnitCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldChangedMessagePayload)
                .isInstanceOf(BusinessUnitCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", BusinessUnitCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", BusinessUnitCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "oldValue",
                        BusinessUnitCustomFieldChangedMessagePayload.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldChangedMessagePayload value = BusinessUnitCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitCustomFieldChangedMessagePayload value = BusinessUnitCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        BusinessUnitCustomFieldChangedMessagePayload value = BusinessUnitCustomFieldChangedMessagePayload.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
