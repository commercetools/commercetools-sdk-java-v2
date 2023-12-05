
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
public class ExtensionChangeDestinationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionChangeDestinationActionBuilder builder) {
        ExtensionChangeDestinationAction extensionChangeDestinationAction = builder.buildUnchecked();
        Assertions.assertThat(extensionChangeDestinationAction).isInstanceOf(ExtensionChangeDestinationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionChangeDestinationAction.builder()
                .destination(new com.commercetools.api.models.extension.ExtensionDestinationImpl()) } };
    }

    @Test
    public void destination() {
        ExtensionChangeDestinationAction value = ExtensionChangeDestinationAction.of();
        value.setDestination(new com.commercetools.api.models.extension.ExtensionDestinationImpl());
        Assertions.assertThat(value.getDestination())
                .isEqualTo(new com.commercetools.api.models.extension.ExtensionDestinationImpl());
    }
}
