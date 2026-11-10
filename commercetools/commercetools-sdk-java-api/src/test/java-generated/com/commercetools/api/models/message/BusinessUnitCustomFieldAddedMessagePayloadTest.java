
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomFieldAddedMessagePayloadBuilder builder) {
        BusinessUnitCustomFieldAddedMessagePayload businessUnitCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldAddedMessagePayload)
                .isInstanceOf(BusinessUnitCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", BusinessUnitCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", BusinessUnitCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldAddedMessagePayload value = BusinessUnitCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitCustomFieldAddedMessagePayload value = BusinessUnitCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
