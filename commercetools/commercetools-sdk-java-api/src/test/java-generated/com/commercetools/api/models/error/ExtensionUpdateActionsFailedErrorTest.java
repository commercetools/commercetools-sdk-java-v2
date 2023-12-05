
package com.commercetools.api.models.error;

import java.util.Collections;

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
public class ExtensionUpdateActionsFailedErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionUpdateActionsFailedErrorBuilder builder) {
        ExtensionUpdateActionsFailedError extensionUpdateActionsFailedError = builder.buildUnchecked();
        Assertions.assertThat(extensionUpdateActionsFailedError).isInstanceOf(ExtensionUpdateActionsFailedError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionUpdateActionsFailedError.builder().message("message") },
                new Object[] { ExtensionUpdateActionsFailedError.builder()
                        .localizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ExtensionUpdateActionsFailedError.builder().extensionExtraInfo("extensionExtraInfo") },
                new Object[] { ExtensionUpdateActionsFailedError.builder()
                        .extensionErrors(
                            Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl())) } };
    }

    @Test
    public void message() {
        ExtensionUpdateActionsFailedError value = ExtensionUpdateActionsFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void localizedMessage() {
        ExtensionUpdateActionsFailedError value = ExtensionUpdateActionsFailedError.of();
        value.setLocalizedMessage(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLocalizedMessage())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void extensionExtraInfo() {
        ExtensionUpdateActionsFailedError value = ExtensionUpdateActionsFailedError.of();
        value.setExtensionExtraInfo("extensionExtraInfo");
        Assertions.assertThat(value.getExtensionExtraInfo()).isEqualTo("extensionExtraInfo");
    }

    @Test
    public void extensionErrors() {
        ExtensionUpdateActionsFailedError value = ExtensionUpdateActionsFailedError.of();
        value.setExtensionErrors(
            Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
        Assertions.assertThat(value.getExtensionErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ExtensionErrorImpl()));
    }
}
