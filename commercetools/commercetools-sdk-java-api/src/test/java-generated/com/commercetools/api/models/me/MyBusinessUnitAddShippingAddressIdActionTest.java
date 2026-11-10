
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitAddShippingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitAddShippingAddressIdActionBuilder builder) {
        MyBusinessUnitAddShippingAddressIdAction myBusinessUnitAddShippingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitAddShippingAddressIdAction)
                .isInstanceOf(MyBusinessUnitAddShippingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyBusinessUnitAddShippingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyBusinessUnitAddShippingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitAddShippingAddressIdAction value = MyBusinessUnitAddShippingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitAddShippingAddressIdAction value = MyBusinessUnitAddShippingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
