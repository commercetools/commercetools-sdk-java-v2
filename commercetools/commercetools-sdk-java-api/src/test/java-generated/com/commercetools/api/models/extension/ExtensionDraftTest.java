
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
public class ExtensionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ExtensionDraftBuilder builder) {
        ExtensionDraft extensionDraft = builder.buildUnchecked();
        Assertions.assertThat(extensionDraft).isInstanceOf(ExtensionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ExtensionDraft.builder().key("key") },
                new Object[] { ExtensionDraft.builder()
                        .destination(new com.commercetools.api.models.extension.ExtensionDestinationImpl()) },
                new Object[] { ExtensionDraft.builder()
                        .triggers(Collections
                                .singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl())) },
                new Object[] { ExtensionDraft.builder().timeoutInMs(6) } };
    }

    @Test
    public void key() {
        ExtensionDraft value = ExtensionDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void destination() {
        ExtensionDraft value = ExtensionDraft.of();
        value.setDestination(new com.commercetools.api.models.extension.ExtensionDestinationImpl());
        Assertions.assertThat(value.getDestination())
                .isEqualTo(new com.commercetools.api.models.extension.ExtensionDestinationImpl());
    }

    @Test
    public void triggers() {
        ExtensionDraft value = ExtensionDraft.of();
        value.setTriggers(Collections.singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl()));
        Assertions.assertThat(value.getTriggers())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.extension.ExtensionTriggerImpl()));
    }

    @Test
    public void timeoutInMs() {
        ExtensionDraft value = ExtensionDraft.of();
        value.setTimeoutInMs(6);
        Assertions.assertThat(value.getTimeoutInMs()).isEqualTo(6);
    }
}
