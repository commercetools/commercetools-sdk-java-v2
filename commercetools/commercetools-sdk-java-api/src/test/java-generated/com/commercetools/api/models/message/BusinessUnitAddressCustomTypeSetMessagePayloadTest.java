
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressCustomTypeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressCustomTypeSetMessagePayloadBuilder builder) {
        BusinessUnitAddressCustomTypeSetMessagePayload businessUnitAddressCustomTypeSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomTypeSetMessagePayload)
                .isInstanceOf(BusinessUnitAddressCustomTypeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        BusinessUnitAddressCustomTypeSetMessagePayload.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId",
                        BusinessUnitAddressCustomTypeSetMessagePayload.builder().oldTypeId("oldTypeId") },
                new Object[] { "addressId",
                        BusinessUnitAddressCustomTypeSetMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void customFields() {
        BusinessUnitAddressCustomTypeSetMessagePayload value = BusinessUnitAddressCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        BusinessUnitAddressCustomTypeSetMessagePayload value = BusinessUnitAddressCustomTypeSetMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomTypeSetMessagePayload value = BusinessUnitAddressCustomTypeSetMessagePayload.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
