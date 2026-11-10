
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerResetPasswordTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerResetPasswordBuilder builder) {
        CustomerResetPassword customerResetPassword = builder.buildUnchecked();
        Assertions.assertThat(customerResetPassword).isInstanceOf(CustomerResetPassword.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tokenValue", CustomerResetPassword.builder().tokenValue("tokenValue") },
                new Object[] { "newPassword", CustomerResetPassword.builder().newPassword("newPassword") },
                new Object[] { "version", CustomerResetPassword.builder().version(2L) } };
    }

    @Test
    public void tokenValue() {
        CustomerResetPassword value = CustomerResetPassword.of();
        value.setTokenValue("tokenValue");
        Assertions.assertThat(value.getTokenValue()).isEqualTo("tokenValue");
    }

    @Test
    public void newPassword() {
        CustomerResetPassword value = CustomerResetPassword.of();
        value.setNewPassword("newPassword");
        Assertions.assertThat(value.getNewPassword()).isEqualTo("newPassword");
    }

    @Test
    public void version() {
        CustomerResetPassword value = CustomerResetPassword.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }
}
