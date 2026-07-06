
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerShippingAddressRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerShippingAddressRemovedMessageBuilder builder) {
        CustomerShippingAddressRemovedMessage customerShippingAddressRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerShippingAddressRemovedMessage)
                .isInstanceOf(CustomerShippingAddressRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", CustomerShippingAddressRemovedMessage.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        CustomerShippingAddressRemovedMessage value = CustomerShippingAddressRemovedMessage.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
