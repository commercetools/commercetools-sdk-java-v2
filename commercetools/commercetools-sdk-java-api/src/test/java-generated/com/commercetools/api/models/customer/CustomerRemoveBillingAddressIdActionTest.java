
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerRemoveBillingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerRemoveBillingAddressIdActionBuilder builder) {
        CustomerRemoveBillingAddressIdAction customerRemoveBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(customerRemoveBillingAddressIdAction)
                .isInstanceOf(CustomerRemoveBillingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", CustomerRemoveBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        CustomerRemoveBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerRemoveBillingAddressIdAction value = CustomerRemoveBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerRemoveBillingAddressIdAction value = CustomerRemoveBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
