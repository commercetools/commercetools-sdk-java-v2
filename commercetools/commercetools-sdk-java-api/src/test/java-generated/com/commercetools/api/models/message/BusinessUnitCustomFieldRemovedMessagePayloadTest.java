
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomFieldRemovedMessagePayloadBuilder builder) {
        BusinessUnitCustomFieldRemovedMessagePayload businessUnitCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldRemovedMessagePayload)
                .isInstanceOf(BusinessUnitCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", BusinessUnitCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldRemovedMessagePayload value = BusinessUnitCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
