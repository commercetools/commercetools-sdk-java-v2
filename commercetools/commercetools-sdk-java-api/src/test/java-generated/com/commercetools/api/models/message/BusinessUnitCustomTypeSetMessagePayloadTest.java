
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomTypeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomTypeSetMessagePayloadBuilder builder) {
        BusinessUnitCustomTypeSetMessagePayload businessUnitCustomTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCustomTypeSetMessagePayload)
                .isInstanceOf(BusinessUnitCustomTypeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        BusinessUnitCustomTypeSetMessagePayload.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId",
                        BusinessUnitCustomTypeSetMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void customFields() {
        BusinessUnitCustomTypeSetMessagePayload value = BusinessUnitCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        BusinessUnitCustomTypeSetMessagePayload value = BusinessUnitCustomTypeSetMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
