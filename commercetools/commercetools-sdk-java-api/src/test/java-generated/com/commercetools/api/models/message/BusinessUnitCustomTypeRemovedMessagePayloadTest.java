
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitCustomTypeRemovedMessagePayloadBuilder builder) {
        BusinessUnitCustomTypeRemovedMessagePayload businessUnitCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomTypeRemovedMessagePayload)
                .isInstanceOf(BusinessUnitCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "oldTypeId",
                BusinessUnitCustomTypeRemovedMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        BusinessUnitCustomTypeRemovedMessagePayload value = BusinessUnitCustomTypeRemovedMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
