
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitShippingAddressRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitShippingAddressRemovedMessagePayloadBuilder builder) {
        BusinessUnitShippingAddressRemovedMessagePayload businessUnitShippingAddressRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitShippingAddressRemovedMessagePayload)
                .isInstanceOf(BusinessUnitShippingAddressRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", BusinessUnitShippingAddressRemovedMessagePayload.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        BusinessUnitShippingAddressRemovedMessagePayload value = BusinessUnitShippingAddressRemovedMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
