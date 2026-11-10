
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerDefaultBillingAddressSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerDefaultBillingAddressSetMessagePayloadBuilder builder) {
        CustomerDefaultBillingAddressSetMessagePayload customerDefaultBillingAddressSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerDefaultBillingAddressSetMessagePayload)
                .isInstanceOf(CustomerDefaultBillingAddressSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", CustomerDefaultBillingAddressSetMessagePayload.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        CustomerDefaultBillingAddressSetMessagePayload value = CustomerDefaultBillingAddressSetMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
