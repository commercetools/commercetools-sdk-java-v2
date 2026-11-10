
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerLabelBuilder builder) {
        CustomerLabel customerLabel = builder.buildUnchecked();
        Assertions.assertThat(customerLabel).isInstanceOf(CustomerLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "firstName", CustomerLabel.builder().firstName("firstName") },
                new Object[] { "lastName", CustomerLabel.builder().lastName("lastName") },
                new Object[] { "customerNumber", CustomerLabel.builder().customerNumber("customerNumber") } };
    }

    @Test
    public void firstName() {
        CustomerLabel value = CustomerLabel.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        CustomerLabel value = CustomerLabel.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void customerNumber() {
        CustomerLabel value = CustomerLabel.of();
        value.setCustomerNumber("customerNumber");
        Assertions.assertThat(value.getCustomerNumber()).isEqualTo("customerNumber");
    }
}
