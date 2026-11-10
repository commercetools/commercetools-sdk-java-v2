
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerChangeAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerChangeAddressActionBuilder builder) {
        CustomerChangeAddressAction customerChangeAddressAction = builder.buildUnchecked();
        Assertions.assertThat(customerChangeAddressAction).isInstanceOf(CustomerChangeAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", CustomerChangeAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey", CustomerChangeAddressAction.builder().addressKey("addressKey") },
                new Object[] { "address", CustomerChangeAddressAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void addressId() {
        CustomerChangeAddressAction value = CustomerChangeAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        CustomerChangeAddressAction value = CustomerChangeAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void address() {
        CustomerChangeAddressAction value = CustomerChangeAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
