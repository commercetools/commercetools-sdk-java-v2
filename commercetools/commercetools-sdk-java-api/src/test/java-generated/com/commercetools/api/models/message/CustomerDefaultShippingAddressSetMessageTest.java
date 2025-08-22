
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerDefaultShippingAddressSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerDefaultShippingAddressSetMessageBuilder builder) {
        CustomerDefaultShippingAddressSetMessage customerDefaultShippingAddressSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerDefaultShippingAddressSetMessage)
                .isInstanceOf(CustomerDefaultShippingAddressSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", CustomerDefaultShippingAddressSetMessage.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        CustomerDefaultShippingAddressSetMessage value = CustomerDefaultShippingAddressSetMessage.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
