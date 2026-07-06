
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddressChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddressChangedMessagePayloadBuilder builder) {
        BusinessUnitAddressChangedMessagePayload businessUnitAddressChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAddressChangedMessagePayload)
                .isInstanceOf(BusinessUnitAddressChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "address",
                        BusinessUnitAddressChangedMessagePayload.builder()
                                .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "addressRoles",
                        BusinessUnitAddressChangedMessagePayload.builder()
                                .addressRoles(Collections.singletonList(
                                    com.commercetools.api.models.common.AddressRole.findEnum("Shipping"))) } };
    }

    @Test
    public void address() {
        BusinessUnitAddressChangedMessagePayload value = BusinessUnitAddressChangedMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void addressRoles() {
        BusinessUnitAddressChangedMessagePayload value = BusinessUnitAddressChangedMessagePayload.of();
        value.setAddressRoles(
            Collections.singletonList(com.commercetools.api.models.common.AddressRole.findEnum("Shipping")));
        Assertions.assertThat(value.getAddressRoles())
                .isEqualTo(
                    Collections.singletonList(com.commercetools.api.models.common.AddressRole.findEnum("Shipping")));
    }
}
