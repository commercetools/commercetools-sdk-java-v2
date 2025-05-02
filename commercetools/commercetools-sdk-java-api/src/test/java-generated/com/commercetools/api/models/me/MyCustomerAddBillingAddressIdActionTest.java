
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerAddBillingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerAddBillingAddressIdActionBuilder builder) {
        MyCustomerAddBillingAddressIdAction myCustomerAddBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerAddBillingAddressIdAction)
                .isInstanceOf(MyCustomerAddBillingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyCustomerAddBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey", MyCustomerAddBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerAddBillingAddressIdAction value = MyCustomerAddBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerAddBillingAddressIdAction value = MyCustomerAddBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
