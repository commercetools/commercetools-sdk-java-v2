
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerAddShippingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerAddShippingAddressIdActionBuilder builder) {
        MyCustomerAddShippingAddressIdAction myCustomerAddShippingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerAddShippingAddressIdAction)
                .isInstanceOf(MyCustomerAddShippingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyCustomerAddShippingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyCustomerAddShippingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerAddShippingAddressIdAction value = MyCustomerAddShippingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerAddShippingAddressIdAction value = MyCustomerAddShippingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
