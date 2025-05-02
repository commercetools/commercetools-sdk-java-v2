
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressCustomTypeRemovedMessageBuilder builder) {
        BusinessUnitAddressCustomTypeRemovedMessage businessUnitAddressCustomTypeRemovedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomTypeRemovedMessage)
                .isInstanceOf(BusinessUnitAddressCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldTypeId",
                        BusinessUnitAddressCustomTypeRemovedMessage.builder().oldTypeId("oldTypeId") },
                new Object[] { "addressId",
                        BusinessUnitAddressCustomTypeRemovedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void oldTypeId() {
        BusinessUnitAddressCustomTypeRemovedMessage value = BusinessUnitAddressCustomTypeRemovedMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomTypeRemovedMessage value = BusinessUnitAddressCustomTypeRemovedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
