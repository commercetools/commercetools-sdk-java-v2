
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddBillingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddBillingAddressIdActionBuilder builder) {
        BusinessUnitAddBillingAddressIdAction businessUnitAddBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAddBillingAddressIdAction)
                .isInstanceOf(BusinessUnitAddBillingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", BusinessUnitAddBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        BusinessUnitAddBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        BusinessUnitAddBillingAddressIdAction value = BusinessUnitAddBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitAddBillingAddressIdAction value = BusinessUnitAddBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
