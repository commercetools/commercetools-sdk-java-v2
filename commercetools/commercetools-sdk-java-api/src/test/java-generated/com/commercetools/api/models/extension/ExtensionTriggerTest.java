
package com.commercetools.api.models.extension;

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
public class ExtensionTriggerTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionTriggerBuilder builder) {
        ExtensionTrigger extensionTrigger = builder.buildUnchecked();
        Assertions.assertThat(extensionTrigger).isInstanceOf(ExtensionTrigger.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionTrigger.builder()
                .resourceTypeId(com.commercetools.api.models.extension.ExtensionResourceTypeId.findEnum("cart")) },
                new Object[] { ExtensionTrigger.builder()
                        .actions(Collections.singletonList(
                            com.commercetools.api.models.extension.ExtensionAction.findEnum("Create"))) },
                new Object[] { ExtensionTrigger.builder().condition("condition") } };
    }

    @Test
    public void resourceTypeId() {
        ExtensionTrigger value = ExtensionTrigger.of();
        value.setResourceTypeId(com.commercetools.api.models.extension.ExtensionResourceTypeId.findEnum("cart"));
        Assertions.assertThat(value.getResourceTypeId())
                .isEqualTo(com.commercetools.api.models.extension.ExtensionResourceTypeId.findEnum("cart"));
    }

    @Test
    public void actions() {
        ExtensionTrigger value = ExtensionTrigger.of();
        value.setActions(
            Collections.singletonList(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create")));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections
                        .singletonList(com.commercetools.api.models.extension.ExtensionAction.findEnum("Create")));
    }

    @Test
    public void condition() {
        ExtensionTrigger value = ExtensionTrigger.of();
        value.setCondition("condition");
        Assertions.assertThat(value.getCondition()).isEqualTo("condition");
    }
}
