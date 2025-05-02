
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder builder) {
        BusinessUnitAddressCustomTypeRemovedMessagePayload businessUnitAddressCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomTypeRemovedMessagePayload)
                .isInstanceOf(BusinessUnitAddressCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldTypeId",
                        BusinessUnitAddressCustomTypeRemovedMessagePayload.builder().oldTypeId("oldTypeId") },
                new Object[] { "addressId",
                        BusinessUnitAddressCustomTypeRemovedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void oldTypeId() {
        BusinessUnitAddressCustomTypeRemovedMessagePayload value = BusinessUnitAddressCustomTypeRemovedMessagePayload
                .of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomTypeRemovedMessagePayload value = BusinessUnitAddressCustomTypeRemovedMessagePayload
                .of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
