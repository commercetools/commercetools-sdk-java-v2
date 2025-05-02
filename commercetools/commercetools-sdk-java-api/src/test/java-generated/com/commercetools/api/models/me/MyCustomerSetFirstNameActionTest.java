
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetFirstNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetFirstNameActionBuilder builder) {
        MyCustomerSetFirstNameAction myCustomerSetFirstNameAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetFirstNameAction).isInstanceOf(MyCustomerSetFirstNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "firstName", MyCustomerSetFirstNameAction.builder().firstName("firstName") } };
    }

    @Test
    public void firstName() {
        MyCustomerSetFirstNameAction value = MyCustomerSetFirstNameAction.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }
}
