
package com.commercetools.api.models.extension;

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
public class AuthorizationHeaderAuthenticationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AuthorizationHeaderAuthenticationBuilder builder) {
        AuthorizationHeaderAuthentication authorizationHeaderAuthentication = builder.buildUnchecked();
        Assertions.assertThat(authorizationHeaderAuthentication).isInstanceOf(AuthorizationHeaderAuthentication.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { AuthorizationHeaderAuthentication.builder().headerValue("headerValue") } };
    }

    @Test
    public void headerValue() {
        AuthorizationHeaderAuthentication value = AuthorizationHeaderAuthentication.of();
        value.setHeaderValue("headerValue");
        Assertions.assertThat(value.getHeaderValue()).isEqualTo("headerValue");
    }
}
