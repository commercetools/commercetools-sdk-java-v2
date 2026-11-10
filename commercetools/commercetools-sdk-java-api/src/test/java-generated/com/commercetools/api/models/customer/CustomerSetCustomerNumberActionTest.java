
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetCustomerNumberActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetCustomerNumberActionBuilder builder) {
        CustomerSetCustomerNumberAction customerSetCustomerNumberAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetCustomerNumberAction).isInstanceOf(CustomerSetCustomerNumberAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerNumber",
                CustomerSetCustomerNumberAction.builder().customerNumber("customerNumber") } };
    }

    @Test
    public void customerNumber() {
        CustomerSetCustomerNumberAction value = CustomerSetCustomerNumberAction.of();
        value.setCustomerNumber("customerNumber");
        Assertions.assertThat(value.getCustomerNumber()).isEqualTo("customerNumber");
    }
}
