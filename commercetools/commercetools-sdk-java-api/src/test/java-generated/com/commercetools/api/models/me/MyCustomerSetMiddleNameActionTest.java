
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetMiddleNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetMiddleNameActionBuilder builder) {
        MyCustomerSetMiddleNameAction myCustomerSetMiddleNameAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetMiddleNameAction).isInstanceOf(MyCustomerSetMiddleNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "middleName", MyCustomerSetMiddleNameAction.builder().middleName("middleName") } };
    }

    @Test
    public void middleName() {
        MyCustomerSetMiddleNameAction value = MyCustomerSetMiddleNameAction.of();
        value.setMiddleName("middleName");
        Assertions.assertThat(value.getMiddleName()).isEqualTo("middleName");
    }
}
