
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitRemoveAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitRemoveAddressActionBuilder builder) {
        MyBusinessUnitRemoveAddressAction myBusinessUnitRemoveAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitRemoveAddressAction).isInstanceOf(MyBusinessUnitRemoveAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyBusinessUnitRemoveAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey", MyBusinessUnitRemoveAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitRemoveAddressAction value = MyBusinessUnitRemoveAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitRemoveAddressAction value = MyBusinessUnitRemoveAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
