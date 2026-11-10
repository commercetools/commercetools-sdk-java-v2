
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerRemoveShippingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerRemoveShippingAddressIdActionBuilder builder) {
        CustomerRemoveShippingAddressIdAction customerRemoveShippingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(customerRemoveShippingAddressIdAction)
                .isInstanceOf(CustomerRemoveShippingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", CustomerRemoveShippingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        CustomerRemoveShippingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerRemoveShippingAddressIdAction value = CustomerRemoveShippingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerRemoveShippingAddressIdAction value = CustomerRemoveShippingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
