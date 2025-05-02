
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerChangeEmailActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerChangeEmailActionBuilder builder) {
        CustomerChangeEmailAction customerChangeEmailAction = builder.buildUnchecked();
        Assertions.assertThat(customerChangeEmailAction).isInstanceOf(CustomerChangeEmailAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", CustomerChangeEmailAction.builder().email("email") } };
    }

    @Test
    public void email() {
        CustomerChangeEmailAction value = CustomerChangeEmailAction.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
