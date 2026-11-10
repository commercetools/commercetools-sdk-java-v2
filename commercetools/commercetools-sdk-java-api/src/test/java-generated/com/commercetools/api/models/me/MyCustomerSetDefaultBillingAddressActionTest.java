
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetDefaultBillingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetDefaultBillingAddressActionBuilder builder) {
        MyCustomerSetDefaultBillingAddressAction myCustomerSetDefaultBillingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetDefaultBillingAddressAction)
                .isInstanceOf(MyCustomerSetDefaultBillingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyCustomerSetDefaultBillingAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyCustomerSetDefaultBillingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerSetDefaultBillingAddressAction value = MyCustomerSetDefaultBillingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerSetDefaultBillingAddressAction value = MyCustomerSetDefaultBillingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
