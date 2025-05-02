
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitSetAddressCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitSetAddressCustomTypeActionBuilder builder) {
        MyBusinessUnitSetAddressCustomTypeAction myBusinessUnitSetAddressCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetAddressCustomTypeAction)
                .isInstanceOf(MyBusinessUnitSetAddressCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        MyBusinessUnitSetAddressCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields",
                        MyBusinessUnitSetAddressCustomTypeAction.builder()
                                .fields(new com.commercetools.api.models.type.FieldContainerImpl()) },
                new Object[] { "addressId",
                        MyBusinessUnitSetAddressCustomTypeAction.builder().addressId("addressId") } };
    }

    @Test
    public void type() {
        MyBusinessUnitSetAddressCustomTypeAction value = MyBusinessUnitSetAddressCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        MyBusinessUnitSetAddressCustomTypeAction value = MyBusinessUnitSetAddressCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }

    @Test
    public void addressId() {
        MyBusinessUnitSetAddressCustomTypeAction value = MyBusinessUnitSetAddressCustomTypeAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
