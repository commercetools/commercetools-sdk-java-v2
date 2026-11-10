
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitBillingAddressRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitBillingAddressRemovedMessagePayloadBuilder builder) {
        BusinessUnitBillingAddressRemovedMessagePayload businessUnitBillingAddressRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitBillingAddressRemovedMessagePayload)
                .isInstanceOf(BusinessUnitBillingAddressRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", BusinessUnitBillingAddressRemovedMessagePayload.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        BusinessUnitBillingAddressRemovedMessagePayload value = BusinessUnitBillingAddressRemovedMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
