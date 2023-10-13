
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
public class ExtensionSetTimeoutInMsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionSetTimeoutInMsActionBuilder builder) {
        ExtensionSetTimeoutInMsAction extensionSetTimeoutInMsAction = builder.buildUnchecked();
        Assertions.assertThat(extensionSetTimeoutInMsAction).isInstanceOf(ExtensionSetTimeoutInMsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionSetTimeoutInMsAction.builder().timeoutInMs(6) } };
    }

    @Test
    public void timeoutInMs() {
        ExtensionSetTimeoutInMsAction value = ExtensionSetTimeoutInMsAction.of();
        value.setTimeoutInMs(6);
        Assertions.assertThat(value.getTimeoutInMs()).isEqualTo(6);
    }
}
