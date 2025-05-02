
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitChangeAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitChangeAddressActionBuilder builder) {
        BusinessUnitChangeAddressAction businessUnitChangeAddressAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitChangeAddressAction).isInstanceOf(BusinessUnitChangeAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", BusinessUnitChangeAddressAction.builder().addressId("addressId") },
                new Object[] { "addressKey", BusinessUnitChangeAddressAction.builder().addressKey("addressKey") },
                new Object[] { "address", BusinessUnitChangeAddressAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void addressId() {
        BusinessUnitChangeAddressAction value = BusinessUnitChangeAddressAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void addressKey() {
        BusinessUnitChangeAddressAction value = BusinessUnitChangeAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void address() {
        BusinessUnitChangeAddressAction value = BusinessUnitChangeAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
