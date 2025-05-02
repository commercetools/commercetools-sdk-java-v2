
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitRemoveBillingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitRemoveBillingAddressIdActionBuilder builder) {
        MyBusinessUnitRemoveBillingAddressIdAction myBusinessUnitRemoveBillingAddressIdAction = builder
                .buildUnchecked();
        Assertions.assertThat(myBusinessUnitRemoveBillingAddressIdAction)
                .isInstanceOf(MyBusinessUnitRemoveBillingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        MyBusinessUnitRemoveBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        MyBusinessUnitRemoveBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitRemoveBillingAddressIdAction value = MyBusinessUnitRemoveBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitRemoveBillingAddressIdAction value = MyBusinessUnitRemoveBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
