
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddShippingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddShippingAddressIdActionBuilder builder) {
        BusinessUnitAddShippingAddressIdAction businessUnitAddShippingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAddShippingAddressIdAction)
                .isInstanceOf(BusinessUnitAddShippingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", BusinessUnitAddShippingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        BusinessUnitAddShippingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        BusinessUnitAddShippingAddressIdAction value = BusinessUnitAddShippingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitAddShippingAddressIdAction value = BusinessUnitAddShippingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
