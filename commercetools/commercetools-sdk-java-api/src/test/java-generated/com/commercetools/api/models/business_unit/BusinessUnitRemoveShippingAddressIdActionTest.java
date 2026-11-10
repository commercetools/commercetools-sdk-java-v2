
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitRemoveShippingAddressIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitRemoveShippingAddressIdActionBuilder builder) {
        BusinessUnitRemoveShippingAddressIdAction businessUnitRemoveShippingAddressIdAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitRemoveShippingAddressIdAction)
                .isInstanceOf(BusinessUnitRemoveShippingAddressIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        BusinessUnitRemoveShippingAddressIdAction.builder().addressId("addressId") },
                new Object[] { "addressKey",
                        BusinessUnitRemoveShippingAddressIdAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        BusinessUnitRemoveShippingAddressIdAction value = BusinessUnitRemoveShippingAddressIdAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitRemoveShippingAddressIdAction value = BusinessUnitRemoveShippingAddressIdAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
