
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
public class MyCustomerChangePasswordTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCustomerChangePasswordBuilder builder) {
        MyCustomerChangePassword myCustomerChangePassword = builder.buildUnchecked();
        Assertions.assertThat(myCustomerChangePassword).isInstanceOf(MyCustomerChangePassword.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyCustomerChangePassword.builder().version(2L) },
                new Object[] { MyCustomerChangePassword.builder().currentPassword("currentPassword") },
                new Object[] { MyCustomerChangePassword.builder().newPassword("newPassword") } };
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
