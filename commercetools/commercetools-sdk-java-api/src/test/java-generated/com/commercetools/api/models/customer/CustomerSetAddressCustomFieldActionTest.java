
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetAddressCustomFieldActionBuilder builder) {
        CustomerSetAddressCustomFieldAction customerSetAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetAddressCustomFieldAction)
                .isInstanceOf(CustomerSetAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressId", CustomerSetAddressCustomFieldAction.builder().addressId("addressId") },
                new Object[] { "name", CustomerSetAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", CustomerSetAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressId() {
        CustomerSetAddressCustomFieldAction value = CustomerSetAddressCustomFieldAction.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void name() {
        CustomerSetAddressCustomFieldAction value = CustomerSetAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerSetAddressCustomFieldAction value = CustomerSetAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
