
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitRemoveAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitRemoveAddressActionBuilder builder) {
        BusinessUnitRemoveAddressAction businessUnitRemoveAddressAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitRemoveAddressAction).isInstanceOf(BusinessUnitRemoveAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", BusinessUnitRemoveAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey", BusinessUnitRemoveAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressId() {
        BusinessUnitRemoveAddressAction value = BusinessUnitRemoveAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitRemoveAddressAction value = BusinessUnitRemoveAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
