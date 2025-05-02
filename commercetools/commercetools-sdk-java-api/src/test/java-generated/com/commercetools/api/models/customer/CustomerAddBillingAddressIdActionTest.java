
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddBillingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddBillingAddressIdActionBuilder builder) {
        CustomerAddBillingAddressIdAction customerAddBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(customerAddBillingAddressIdAction).isInstanceOf(CustomerAddBillingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", CustomerAddBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey", CustomerAddBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerAddBillingAddressIdAction value = CustomerAddBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerAddBillingAddressIdAction value = CustomerAddBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
