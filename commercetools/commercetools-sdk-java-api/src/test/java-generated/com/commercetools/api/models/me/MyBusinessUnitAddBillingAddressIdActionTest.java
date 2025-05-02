
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitAddBillingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitAddBillingAddressIdActionBuilder builder) {
        MyBusinessUnitAddBillingAddressIdAction myBusinessUnitAddBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitAddBillingAddressIdAction)
                .isInstanceOf(MyBusinessUnitAddBillingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyBusinessUnitAddBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyBusinessUnitAddBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitAddBillingAddressIdAction value = MyBusinessUnitAddBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitAddBillingAddressIdAction value = MyBusinessUnitAddBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
