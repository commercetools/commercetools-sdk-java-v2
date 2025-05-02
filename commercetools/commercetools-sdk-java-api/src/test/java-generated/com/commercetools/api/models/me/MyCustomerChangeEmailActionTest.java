
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerChangeEmailActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerChangeEmailActionBuilder builder) {
        MyCustomerChangeEmailAction myCustomerChangeEmailAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerChangeEmailAction).isInstanceOf(MyCustomerChangeEmailAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", MyCustomerChangeEmailAction.builder().email("email") } };
    }

    @Test
    public void email() {
        MyCustomerChangeEmailAction value = MyCustomerChangeEmailAction.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
