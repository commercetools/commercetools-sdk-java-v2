
package com.commercetools.api.models.project;

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
public class ExternalOAuthTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExternalOAuthBuilder builder) {
        ExternalOAuth externalOAuth = builder.buildUnchecked();
        Assertions.assertThat(externalOAuth).isInstanceOf(ExternalOAuth.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExternalOAuth.builder().url("url") },
                new Object[] { ExternalOAuth.builder().authorizationHeader("authorizationHeader") } };
    }

    @Test
    public void url() {
        ExternalOAuth value = ExternalOAuth.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }

    @Test
    public void authorizationHeader() {
        ExternalOAuth value = ExternalOAuth.of();
        value.setAuthorizationHeader("authorizationHeader");
        Assertions.assertThat(value.getAuthorizationHeader()).isEqualTo("authorizationHeader");
    }
}
