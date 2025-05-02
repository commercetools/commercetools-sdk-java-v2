
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerChangePasswordTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerChangePasswordBuilder builder) {
        MyCustomerChangePassword myCustomerChangePassword = builder.buildUnchecked();
        Assertions.assertThat(myCustomerChangePassword).isInstanceOf(MyCustomerChangePassword.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", MyCustomerChangePassword.builder().version(2L) },
                new Object[] { "currentPassword",
                        MyCustomerChangePassword.builder().currentPassword("currentPassword") },
                new Object[] { "newPassword", MyCustomerChangePassword.builder().newPassword("newPassword") } };
    }

    @Test
    public void version() {
        MyCustomerChangePassword value = MyCustomerChangePassword.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void currentPassword() {
        MyCustomerChangePassword value = MyCustomerChangePassword.of();
        value.setCurrentPassword("currentPassword");
        Assertions.assertThat(value.getCurrentPassword()).isEqualTo("currentPassword");
    }

    @Test
    public void newPassword() {
        MyCustomerChangePassword value = MyCustomerChangePassword.of();
        value.setNewPassword("newPassword");
        Assertions.assertThat(value.getNewPassword()).isEqualTo("newPassword");
    }
}
