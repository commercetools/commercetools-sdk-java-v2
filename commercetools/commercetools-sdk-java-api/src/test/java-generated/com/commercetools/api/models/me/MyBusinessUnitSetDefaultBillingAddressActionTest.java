
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitSetDefaultBillingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitSetDefaultBillingAddressActionBuilder builder) {
        MyBusinessUnitSetDefaultBillingAddressAction myBusinessUnitSetDefaultBillingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetDefaultBillingAddressAction)
                .isInstanceOf(MyBusinessUnitSetDefaultBillingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        MyBusinessUnitSetDefaultBillingAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyBusinessUnitSetDefaultBillingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitSetDefaultBillingAddressAction value = MyBusinessUnitSetDefaultBillingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitSetDefaultBillingAddressAction value = MyBusinessUnitSetDefaultBillingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
