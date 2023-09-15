
package com.commercetools.api.models.customer;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CustomerChangePasswordTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerChangePasswordBuilder builder) {
        CustomerChangePassword customerChangePassword = builder.buildUnchecked();
        Assertions.assertThat(customerChangePassword).isInstanceOf(CustomerChangePassword.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerChangePassword.builder().id("id") },
                new Object[] { CustomerChangePassword.builder().version(2L) },
                new Object[] { CustomerChangePassword.builder().currentPassword("currentPassword") },
                new Object[] { CustomerChangePassword.builder().newPassword("newPassword") } };
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
