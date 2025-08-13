
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerDefaultShippingAddressSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerDefaultShippingAddressSetMessagePayloadBuilder builder) {
        CustomerDefaultShippingAddressSetMessagePayload customerDefaultShippingAddressSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerDefaultShippingAddressSetMessagePayload)
                .isInstanceOf(CustomerDefaultShippingAddressSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", CustomerDefaultShippingAddressSetMessagePayload.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        CustomerDefaultShippingAddressSetMessagePayload value = CustomerDefaultShippingAddressSetMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
