
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerShippingAddressRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerShippingAddressRemovedMessagePayloadBuilder builder) {
        CustomerShippingAddressRemovedMessagePayload customerShippingAddressRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerShippingAddressRemovedMessagePayload)
                .isInstanceOf(CustomerShippingAddressRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", CustomerShippingAddressRemovedMessagePayload.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        CustomerShippingAddressRemovedMessagePayload value = CustomerShippingAddressRemovedMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
