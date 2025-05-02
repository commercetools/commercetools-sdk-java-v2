
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetAddressCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetAddressCustomTypeActionBuilder builder) {
        BusinessUnitSetAddressCustomTypeAction businessUnitSetAddressCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetAddressCustomTypeAction)
                .isInstanceOf(BusinessUnitSetAddressCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        BusinessUnitSetAddressCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields",
                        BusinessUnitSetAddressCustomTypeAction.builder()
                                .fields(new com.commercetools.api.models.type.FieldContainerImpl()) },
                new Object[] { "addressId", BusinessUnitSetAddressCustomTypeAction.builder().addressId("addressId") } };
    }

    @Test
    public void type() {
        BusinessUnitSetAddressCustomTypeAction value = BusinessUnitSetAddressCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        BusinessUnitSetAddressCustomTypeAction value = BusinessUnitSetAddressCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }

    @Test
    public void addressId() {
        BusinessUnitSetAddressCustomTypeAction value = BusinessUnitSetAddressCustomTypeAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
