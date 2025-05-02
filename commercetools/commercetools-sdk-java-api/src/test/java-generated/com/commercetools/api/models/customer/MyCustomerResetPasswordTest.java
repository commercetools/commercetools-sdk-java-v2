
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerResetPasswordTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerResetPasswordBuilder builder) {
        MyCustomerResetPassword myCustomerResetPassword = builder.buildUnchecked();
        Assertions.assertThat(myCustomerResetPassword).isInstanceOf(MyCustomerResetPassword.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "tokenValue", MyCustomerResetPassword.builder().tokenValue("tokenValue") },
                new Object[] { "newPassword", MyCustomerResetPassword.builder().newPassword("newPassword") } };
    }

    @Test
    public void tokenValue() {
        MyCustomerResetPassword value = MyCustomerResetPassword.of();
        value.setTokenValue("tokenValue");
        Assertions.assertThat(value.getTokenValue()).isEqualTo("tokenValue");
    }

    @Test
    public void newPassword() {
        MyCustomerResetPassword value = MyCustomerResetPassword.of();
        value.setNewPassword("newPassword");
        Assertions.assertThat(value.getNewPassword()).isEqualTo("newPassword");
    }
}
