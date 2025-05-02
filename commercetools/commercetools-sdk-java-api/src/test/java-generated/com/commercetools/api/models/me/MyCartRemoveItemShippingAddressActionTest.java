
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartRemoveItemShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartRemoveItemShippingAddressActionBuilder builder) {
        MyCartRemoveItemShippingAddressAction myCartRemoveItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myCartRemoveItemShippingAddressAction)
                .isInstanceOf(MyCartRemoveItemShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "addressKey",
                MyCartRemoveItemShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressKey() {
        MyCartRemoveItemShippingAddressAction value = MyCartRemoveItemShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
