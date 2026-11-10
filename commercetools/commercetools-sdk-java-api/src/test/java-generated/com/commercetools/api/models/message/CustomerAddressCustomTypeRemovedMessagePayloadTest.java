
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomTypeRemovedMessagePayloadBuilder builder) {
        CustomerAddressCustomTypeRemovedMessagePayload customerAddressCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerAddressCustomTypeRemovedMessagePayload)
                .isInstanceOf(CustomerAddressCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "previousTypeId",
                        CustomerAddressCustomTypeRemovedMessagePayload.builder().previousTypeId("previousTypeId") },
                new Object[] { "addressId",
                        CustomerAddressCustomTypeRemovedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void previousTypeId() {
        CustomerAddressCustomTypeRemovedMessagePayload value = CustomerAddressCustomTypeRemovedMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomTypeRemovedMessagePayload value = CustomerAddressCustomTypeRemovedMessagePayload.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
