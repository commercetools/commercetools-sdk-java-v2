
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
public class ExtensionChangeTriggersActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionChangeTriggersActionBuilder builder) {
        ExtensionChangeTriggersAction extensionChangeTriggersAction = builder.buildUnchecked();
        Assertions.assertThat(extensionChangeTriggersAction).isInstanceOf(ExtensionChangeTriggersAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionChangeTriggersAction.builder()
                .triggers(
                    Collections.singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl())) } };
    }

    @Test
    public void triggers() {
        ExtensionChangeTriggersAction value = ExtensionChangeTriggersAction.of();
        value.setTriggers(Collections.singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl()));
        Assertions.assertThat(value.getTriggers())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl()));
    }
}
