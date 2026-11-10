
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetFirstNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetFirstNameActionBuilder builder) {
        CustomerSetFirstNameAction customerSetFirstNameAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetFirstNameAction).isInstanceOf(CustomerSetFirstNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "firstName", CustomerSetFirstNameAction.builder().firstName("firstName") } };
    }

    @Test
    public void firstName() {
        CustomerSetFirstNameAction value = CustomerSetFirstNameAction.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }
}
