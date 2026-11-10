
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitRemoveShippingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitRemoveShippingAddressIdActionBuilder builder) {
        MyBusinessUnitRemoveShippingAddressIdAction myBusinessUnitRemoveShippingAddressIdAction = builder
                .buildUnchecked();
        Assertions.assertThat(myBusinessUnitRemoveShippingAddressIdAction)
                .isInstanceOf(MyBusinessUnitRemoveShippingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        MyBusinessUnitRemoveShippingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyBusinessUnitRemoveShippingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitRemoveShippingAddressIdAction value = MyBusinessUnitRemoveShippingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitRemoveShippingAddressIdAction value = MyBusinessUnitRemoveShippingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
