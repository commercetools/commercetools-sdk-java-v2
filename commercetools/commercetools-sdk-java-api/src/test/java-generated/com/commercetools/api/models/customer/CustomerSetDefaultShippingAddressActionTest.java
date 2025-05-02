
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetDefaultShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetDefaultShippingAddressActionBuilder builder) {
        CustomerSetDefaultShippingAddressAction customerSetDefaultShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetDefaultShippingAddressAction)
                .isInstanceOf(CustomerSetDefaultShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", CustomerSetDefaultShippingAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        CustomerSetDefaultShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerSetDefaultShippingAddressAction value = CustomerSetDefaultShippingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerSetDefaultShippingAddressAction value = CustomerSetDefaultShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
