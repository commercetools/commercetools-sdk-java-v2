
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerRemoveAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerRemoveAddressActionBuilder builder) {
        MyCustomerRemoveAddressAction myCustomerRemoveAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerRemoveAddressAction).isInstanceOf(MyCustomerRemoveAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyCustomerRemoveAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey", MyCustomerRemoveAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyCustomerRemoveAddressAction value = MyCustomerRemoveAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyCustomerRemoveAddressAction value = MyCustomerRemoveAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
