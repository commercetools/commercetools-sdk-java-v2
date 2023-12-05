
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
public class AzureFunctionsAuthenticationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AzureFunctionsAuthenticationBuilder builder) {
        AzureFunctionsAuthentication azureFunctionsAuthentication = builder.buildUnchecked();
        Assertions.assertThat(azureFunctionsAuthentication).isInstanceOf(AzureFunctionsAuthentication.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AzureFunctionsAuthentication.builder().key("key") } };
    }

    @Test
    public void key() {
        AzureFunctionsAuthentication value = AzureFunctionsAuthentication.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
