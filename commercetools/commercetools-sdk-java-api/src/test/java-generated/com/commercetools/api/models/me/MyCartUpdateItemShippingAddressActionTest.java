
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartUpdateItemShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartUpdateItemShippingAddressActionBuilder builder) {
        MyCartUpdateItemShippingAddressAction myCartUpdateItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myCartUpdateItemShippingAddressAction)
                .isInstanceOf(MyCartUpdateItemShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "address", MyCartUpdateItemShippingAddressAction.builder()
                .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void address() {
        MyCartUpdateItemShippingAddressAction value = MyCartUpdateItemShippingAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
