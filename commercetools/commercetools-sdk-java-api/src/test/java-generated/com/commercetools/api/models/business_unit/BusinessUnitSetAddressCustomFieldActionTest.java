
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetAddressCustomFieldActionBuilder builder) {
        BusinessUnitSetAddressCustomFieldAction businessUnitSetAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetAddressCustomFieldAction)
                .isInstanceOf(BusinessUnitSetAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", BusinessUnitSetAddressCustomFieldAction.builder().addressId("addressId") },
                new Object[] { "name", BusinessUnitSetAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", BusinessUnitSetAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressId() {
        BusinessUnitSetAddressCustomFieldAction value = BusinessUnitSetAddressCustomFieldAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void name() {
        BusinessUnitSetAddressCustomFieldAction value = BusinessUnitSetAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitSetAddressCustomFieldAction value = BusinessUnitSetAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
