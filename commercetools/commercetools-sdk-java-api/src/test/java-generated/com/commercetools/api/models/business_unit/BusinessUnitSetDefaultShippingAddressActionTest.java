
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetDefaultShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetDefaultShippingAddressActionBuilder builder) {
        BusinessUnitSetDefaultShippingAddressAction businessUnitSetDefaultShippingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitSetDefaultShippingAddressAction)
                .isInstanceOf(BusinessUnitSetDefaultShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        BusinessUnitSetDefaultShippingAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        BusinessUnitSetDefaultShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        BusinessUnitSetDefaultShippingAddressAction value = BusinessUnitSetDefaultShippingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitSetDefaultShippingAddressAction value = BusinessUnitSetDefaultShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
