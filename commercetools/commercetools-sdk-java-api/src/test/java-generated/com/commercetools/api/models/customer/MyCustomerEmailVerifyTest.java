
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerEmailVerifyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerEmailVerifyBuilder builder) {
        MyCustomerEmailVerify myCustomerEmailVerify = builder.buildUnchecked();
        Assertions.assertThat(myCustomerEmailVerify).isInstanceOf(MyCustomerEmailVerify.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "tokenValue", MyCustomerEmailVerify.builder().tokenValue("tokenValue") } };
    }

    @Test
    public void tokenValue() {
        MyCustomerEmailVerify value = MyCustomerEmailVerify.of();
        value.setTokenValue("tokenValue");
        Assertions.assertThat(value.getTokenValue()).isEqualTo("tokenValue");
    }
}
