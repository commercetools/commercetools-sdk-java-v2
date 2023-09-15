
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
public class MyCustomerResetPasswordTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerResetPasswordBuilder builder) {
        MyCustomerResetPassword myCustomerResetPassword = builder.buildUnchecked();
        Assertions.assertThat(myCustomerResetPassword).isInstanceOf(MyCustomerResetPassword.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerResetPassword.builder().tokenValue("tokenValue") },
                new Object[] { MyCustomerResetPassword.builder().newPassword("newPassword") } };
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
