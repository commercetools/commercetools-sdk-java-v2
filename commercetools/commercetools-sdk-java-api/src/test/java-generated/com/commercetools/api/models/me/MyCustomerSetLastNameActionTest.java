
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetLastNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetLastNameActionBuilder builder) {
        MyCustomerSetLastNameAction myCustomerSetLastNameAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetLastNameAction).isInstanceOf(MyCustomerSetLastNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lastName", MyCustomerSetLastNameAction.builder().lastName("lastName") } };
    }

    @Test
    public void lastName() {
        MyCustomerSetLastNameAction value = MyCustomerSetLastNameAction.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }
}
