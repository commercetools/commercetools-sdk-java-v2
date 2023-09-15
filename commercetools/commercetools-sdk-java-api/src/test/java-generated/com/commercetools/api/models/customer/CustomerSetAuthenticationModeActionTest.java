
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
public class CustomerSetAuthenticationModeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetAuthenticationModeActionBuilder builder) {
        CustomerSetAuthenticationModeAction customerSetAuthenticationModeAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetAuthenticationModeAction)
                .isInstanceOf(CustomerSetAuthenticationModeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerSetAuthenticationModeAction.builder()
                        .authMode(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password")) },
                new Object[] { CustomerSetAuthenticationModeAction.builder().password("password") } };
    }

    @Test
    public void authMode() {
        CustomerSetAuthenticationModeAction value = CustomerSetAuthenticationModeAction.of();
        value.setAuthMode(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getAuthMode())
                .isEqualTo(com.commercetools.api.models.customer.AuthenticationMode.findEnum("Password"));
    }

    @Test
    public void password() {
        CustomerSetAuthenticationModeAction value = CustomerSetAuthenticationModeAction.of();
        value.setPassword("password");
        Assertions.assertThat(value.getPassword()).isEqualTo("password");
    }
}
