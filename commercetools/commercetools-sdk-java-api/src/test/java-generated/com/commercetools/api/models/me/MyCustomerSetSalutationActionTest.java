
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetSalutationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetSalutationActionBuilder builder) {
        MyCustomerSetSalutationAction myCustomerSetSalutationAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetSalutationAction).isInstanceOf(MyCustomerSetSalutationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "salutation", MyCustomerSetSalutationAction.builder().salutation("salutation") } };
    }

    @Test
    public void salutation() {
        MyCustomerSetSalutationAction value = MyCustomerSetSalutationAction.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }
}
