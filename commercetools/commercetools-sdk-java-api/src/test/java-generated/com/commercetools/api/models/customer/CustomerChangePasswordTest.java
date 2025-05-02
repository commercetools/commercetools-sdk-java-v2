
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerChangePasswordTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerChangePasswordBuilder builder) {
        CustomerChangePassword customerChangePassword = builder.buildUnchecked();
        Assertions.assertThat(customerChangePassword).isInstanceOf(CustomerChangePassword.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerChangePassword.builder().id("id") },
                new Object[] { "version", CustomerChangePassword.builder().version(2L) },
                new Object[] { "currentPassword", CustomerChangePassword.builder().currentPassword("currentPassword") },
                new Object[] { "newPassword", CustomerChangePassword.builder().newPassword("newPassword") } };
    }

    @Test
    public void id() {
        CustomerChangePassword value = CustomerChangePassword.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        CustomerChangePassword value = CustomerChangePassword.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void currentPassword() {
        CustomerChangePassword value = CustomerChangePassword.of();
        value.setCurrentPassword("currentPassword");
        Assertions.assertThat(value.getCurrentPassword()).isEqualTo("currentPassword");
    }

    @Test
    public void newPassword() {
        CustomerChangePassword value = CustomerChangePassword.of();
        value.setNewPassword("newPassword");
        Assertions.assertThat(value.getNewPassword()).isEqualTo("newPassword");
    }
}
