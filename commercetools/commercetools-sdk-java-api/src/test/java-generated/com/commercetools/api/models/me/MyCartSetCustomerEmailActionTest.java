
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetCustomerEmailActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetCustomerEmailActionBuilder builder) {
        MyCartSetCustomerEmailAction myCartSetCustomerEmailAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetCustomerEmailAction).isInstanceOf(MyCartSetCustomerEmailAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", MyCartSetCustomerEmailAction.builder().email("email") } };
    }

    @Test
    public void email() {
        MyCartSetCustomerEmailAction value = MyCartSetCustomerEmailAction.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
