
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressRemovedMessagePayloadBuilder builder) {
        CustomerAddressRemovedMessagePayload customerAddressRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerAddressRemovedMessagePayload)
                .isInstanceOf(CustomerAddressRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "address",
                        CustomerAddressRemovedMessagePayload.builder()
                                .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "addressRoles",
                        CustomerAddressRemovedMessagePayload.builder()
                                .addressRoles(Collections.singletonList(
                                    com.commercetools.api.models.common.AddressRole.findEnum("Shipping"))) } };
    }

    @Test
    public void address() {
        CustomerAddressRemovedMessagePayload value = CustomerAddressRemovedMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void addressRoles() {
        CustomerAddressRemovedMessagePayload value = CustomerAddressRemovedMessagePayload.of();
        value.setAddressRoles(
            Collections.singletonList(com.commercetools.api.models.common.AddressRole.findEnum("Shipping")));
        Assertions.assertThat(value.getAddressRoles())
                .isEqualTo(
                    Collections.singletonList(com.commercetools.api.models.common.AddressRole.findEnum("Shipping")));
    }
}
