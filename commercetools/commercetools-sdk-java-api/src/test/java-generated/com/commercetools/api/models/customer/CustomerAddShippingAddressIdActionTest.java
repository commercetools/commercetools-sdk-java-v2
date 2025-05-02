
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddShippingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddShippingAddressIdActionBuilder builder) {
        CustomerAddShippingAddressIdAction customerAddShippingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(customerAddShippingAddressIdAction)
                .isInstanceOf(CustomerAddShippingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", CustomerAddShippingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey", CustomerAddShippingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerAddShippingAddressIdAction value = CustomerAddShippingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerAddShippingAddressIdAction value = CustomerAddShippingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
