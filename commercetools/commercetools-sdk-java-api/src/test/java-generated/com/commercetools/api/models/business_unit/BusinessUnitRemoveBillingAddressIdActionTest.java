
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitRemoveBillingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitRemoveBillingAddressIdActionBuilder builder) {
        BusinessUnitRemoveBillingAddressIdAction businessUnitRemoveBillingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitRemoveBillingAddressIdAction)
                .isInstanceOf(BusinessUnitRemoveBillingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", BusinessUnitRemoveBillingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        BusinessUnitRemoveBillingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        BusinessUnitRemoveBillingAddressIdAction value = BusinessUnitRemoveBillingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitRemoveBillingAddressIdAction value = BusinessUnitRemoveBillingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
