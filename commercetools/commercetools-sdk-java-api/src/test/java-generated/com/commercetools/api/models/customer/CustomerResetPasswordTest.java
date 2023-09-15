
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
public class CustomerResetPasswordTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerResetPasswordBuilder builder) {
        CustomerResetPassword customerResetPassword = builder.buildUnchecked();
        Assertions.assertThat(customerResetPassword).isInstanceOf(CustomerResetPassword.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerResetPassword.builder().tokenValue("tokenValue") },
                new Object[] { CustomerResetPassword.builder().newPassword("newPassword") },
                new Object[] { CustomerResetPassword.builder().version(2L) } };
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
