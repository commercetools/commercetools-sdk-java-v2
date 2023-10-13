
package com.commercetools.api.models.error;

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
public class ExternalOAuthFailedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExternalOAuthFailedErrorBuilder builder) {
        ExternalOAuthFailedError externalOAuthFailedError = builder.buildUnchecked();
        Assertions.assertThat(externalOAuthFailedError).isInstanceOf(ExternalOAuthFailedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExternalOAuthFailedError.builder().message("message") } };
    }

    @Test
    public void message() {
        ExternalOAuthFailedError value = ExternalOAuthFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
