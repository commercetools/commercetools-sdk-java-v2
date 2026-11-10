
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerChangeAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerChangeAddressActionBuilder builder) {
        MyCustomerChangeAddressAction myCustomerChangeAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerChangeAddressAction).isInstanceOf(MyCustomerChangeAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyCustomerChangeAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey", MyCustomerChangeAddressAction.builder().addressKey("addressKey") },
                new Object[] { "address", MyCustomerChangeAddressAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void addressId() {
        MyCustomerChangeAddressAction value = MyCustomerChangeAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerChangeAddressAction value = MyCustomerChangeAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void address() {
        MyCustomerChangeAddressAction value = MyCustomerChangeAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
