
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetDefaultBillingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetDefaultBillingAddressActionBuilder builder) {
        BusinessUnitSetDefaultBillingAddressAction businessUnitSetDefaultBillingAddressAction = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitSetDefaultBillingAddressAction)
                .isInstanceOf(BusinessUnitSetDefaultBillingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        BusinessUnitSetDefaultBillingAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        BusinessUnitSetDefaultBillingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        BusinessUnitSetDefaultBillingAddressAction value = BusinessUnitSetDefaultBillingAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitSetDefaultBillingAddressAction value = BusinessUnitSetDefaultBillingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
