
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
public class ExtensionInputTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionInputBuilder builder) {
        ExtensionInput extensionInput = builder.buildUnchecked();
        Assertions.assertThat(extensionInput).isInstanceOf(ExtensionInput.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ExtensionInput.builder()
                        .action(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create")) },
                new Object[] {
                        ExtensionInput.builder().resource(new com.commercetools.api.models.common.ReferenceImpl()) } };
    }

    @Test
    public void action() {
        ExtensionInput value = ExtensionInput.of();
        value.setAction(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create"));
        Assertions.assertThat(value.getAction())
                .isEqualTo(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create"));
    }

    @Test
    public void resource() {
        ExtensionInput value = ExtensionInput.of();
        value.setResource(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getResource()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }
}
