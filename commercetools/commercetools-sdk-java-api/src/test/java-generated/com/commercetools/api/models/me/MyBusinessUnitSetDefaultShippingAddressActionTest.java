
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitSetDefaultShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitSetDefaultShippingAddressActionBuilder builder) {
        MyBusinessUnitSetDefaultShippingAddressAction myBusinessUnitSetDefaultShippingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetDefaultShippingAddressAction)
                .isInstanceOf(MyBusinessUnitSetDefaultShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        MyBusinessUnitSetDefaultShippingAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyBusinessUnitSetDefaultShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitSetDefaultShippingAddressAction value = MyBusinessUnitSetDefaultShippingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitSetDefaultShippingAddressAction value = MyBusinessUnitSetDefaultShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
