
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetDefaultShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetDefaultShippingAddressActionBuilder builder) {
        MyCustomerSetDefaultShippingAddressAction myCustomerSetDefaultShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetDefaultShippingAddressAction)
                .isInstanceOf(MyCustomerSetDefaultShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        MyCustomerSetDefaultShippingAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyCustomerSetDefaultShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerSetDefaultShippingAddressAction value = MyCustomerSetDefaultShippingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerSetDefaultShippingAddressAction value = MyCustomerSetDefaultShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
