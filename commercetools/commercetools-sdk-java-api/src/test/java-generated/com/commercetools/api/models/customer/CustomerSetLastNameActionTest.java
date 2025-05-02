
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetLastNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetLastNameActionBuilder builder) {
        CustomerSetLastNameAction customerSetLastNameAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetLastNameAction).isInstanceOf(CustomerSetLastNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "lastName", CustomerSetLastNameAction.builder().lastName("lastName") } };
    }

    @Test
    public void lastName() {
        CustomerSetLastNameAction value = CustomerSetLastNameAction.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }
}
