
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetMiddleNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetMiddleNameActionBuilder builder) {
        CustomerSetMiddleNameAction customerSetMiddleNameAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetMiddleNameAction).isInstanceOf(CustomerSetMiddleNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "middleName", CustomerSetMiddleNameAction.builder().middleName("middleName") } };
    }

    @Test
    public void middleName() {
        CustomerSetMiddleNameAction value = CustomerSetMiddleNameAction.of();
        value.setMiddleName("middleName");
        Assertions.assertThat(value.getMiddleName()).isEqualTo("middleName");
    }
}
