
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitDefaultShippingAddressSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitDefaultShippingAddressSetMessageBuilder builder) {
        BusinessUnitDefaultShippingAddressSetMessage businessUnitDefaultShippingAddressSetMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitDefaultShippingAddressSetMessage)
                .isInstanceOf(BusinessUnitDefaultShippingAddressSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", BusinessUnitDefaultShippingAddressSetMessage.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        BusinessUnitDefaultShippingAddressSetMessage value = BusinessUnitDefaultShippingAddressSetMessage.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
