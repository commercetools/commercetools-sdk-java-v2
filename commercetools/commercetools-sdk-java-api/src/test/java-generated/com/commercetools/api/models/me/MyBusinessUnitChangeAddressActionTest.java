
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitChangeAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitChangeAddressActionBuilder builder) {
        MyBusinessUnitChangeAddressAction myBusinessUnitChangeAddressAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitChangeAddressAction).isInstanceOf(MyBusinessUnitChangeAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", MyBusinessUnitChangeAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey", MyBusinessUnitChangeAddressAction.builder().addressKey("addressKey") },
                new Object[] { "address", MyBusinessUnitChangeAddressAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitChangeAddressAction value = MyBusinessUnitChangeAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        MyBusinessUnitChangeAddressAction value = MyBusinessUnitChangeAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void address() {
        MyBusinessUnitChangeAddressAction value = MyBusinessUnitChangeAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
