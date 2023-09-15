
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
public class ExtensionNoResponseErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionNoResponseErrorBuilder builder) {
        ExtensionNoResponseError extensionNoResponseError = builder.buildUnchecked();
        Assertions.assertThat(extensionNoResponseError).isInstanceOf(ExtensionNoResponseError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionNoResponseError.builder().message("message") },
                new Object[] { ExtensionNoResponseError.builder().extensionId("extensionId") },
                new Object[] { ExtensionNoResponseError.builder().extensionKey("extensionKey") } };
    }

    @Test
    public void message() {
        ExtensionNoResponseError value = ExtensionNoResponseError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void extensionId() {
        ExtensionNoResponseError value = ExtensionNoResponseError.of();
        value.setExtensionId("extensionId");
        Assertions.assertThat(value.getExtensionId()).isEqualTo("extensionId");
    }

    @Test
    public void extensionKey() {
        ExtensionNoResponseError value = ExtensionNoResponseError.of();
        value.setExtensionKey("extensionKey");
        Assertions.assertThat(value.getExtensionKey()).isEqualTo("extensionKey");
    }
}
