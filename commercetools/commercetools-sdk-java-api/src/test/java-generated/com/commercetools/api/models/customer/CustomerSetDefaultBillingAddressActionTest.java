
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetDefaultBillingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetDefaultBillingAddressActionBuilder builder) {
        CustomerSetDefaultBillingAddressAction customerSetDefaultBillingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetDefaultBillingAddressAction)
                .isInstanceOf(CustomerSetDefaultBillingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", CustomerSetDefaultBillingAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        CustomerSetDefaultBillingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        CustomerSetDefaultBillingAddressAction value = CustomerSetDefaultBillingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerSetDefaultBillingAddressAction value = CustomerSetDefaultBillingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
