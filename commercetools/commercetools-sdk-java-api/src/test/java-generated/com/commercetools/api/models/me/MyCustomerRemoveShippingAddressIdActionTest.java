
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerRemoveShippingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerRemoveShippingAddressIdActionBuilder builder) {
        MyCustomerRemoveShippingAddressIdAction myCustomerRemoveShippingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerRemoveShippingAddressIdAction)
                .isInstanceOf(MyCustomerRemoveShippingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyCustomerRemoveShippingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyCustomerRemoveShippingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerRemoveShippingAddressIdAction value = MyCustomerRemoveShippingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerRemoveShippingAddressIdAction value = MyCustomerRemoveShippingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
