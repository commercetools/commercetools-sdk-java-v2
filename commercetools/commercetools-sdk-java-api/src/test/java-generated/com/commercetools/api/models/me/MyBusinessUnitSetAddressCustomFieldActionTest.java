
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitSetAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitSetAddressCustomFieldActionBuilder builder) {
        MyBusinessUnitSetAddressCustomFieldAction myBusinessUnitSetAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitSetAddressCustomFieldAction)
                .isInstanceOf(MyBusinessUnitSetAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId",
                        MyBusinessUnitSetAddressCustomFieldAction.builder().addressId("addressId") },
                new Object[] { "name", MyBusinessUnitSetAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyBusinessUnitSetAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressId() {
        MyBusinessUnitSetAddressCustomFieldAction value = MyBusinessUnitSetAddressCustomFieldAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void name() {
        MyBusinessUnitSetAddressCustomFieldAction value = MyBusinessUnitSetAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyBusinessUnitSetAddressCustomFieldAction value = MyBusinessUnitSetAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
