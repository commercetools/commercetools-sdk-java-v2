
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerRemoveBillingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerRemoveBillingAddressIdActionBuilder builder) {
        MyCustomerRemoveBillingAddressIdAction myCustomerRemoveBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerRemoveBillingAddressIdAction)
                .isInstanceOf(MyCustomerRemoveBillingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyCustomerRemoveBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyCustomerRemoveBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerRemoveBillingAddressIdAction value = MyCustomerRemoveBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerRemoveBillingAddressIdAction value = MyCustomerRemoveBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
