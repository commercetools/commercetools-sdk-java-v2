
package com.commercetools.api.models.extension;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionDraftBuilder builder) {
        ExtensionDraft extensionDraft = builder.buildUnchecked();
        Assertions.assertThat(extensionDraft).isInstanceOf(ExtensionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ExtensionDraft.builder().key("key") },
                new Object[] { "destination",
                        ExtensionDraft.builder()
                                .destination(new com.commercetools.api.models.extension.ExtensionDestinationImpl()) },
                new Object[] { "triggers",
                        ExtensionDraft.builder()
                                .triggers(Collections.singletonList(
                                    new com.commercetools.api.models.extension.ExtensionTriggerImpl())) },
                new Object[] { "timeoutInMs", ExtensionDraft.builder().timeoutInMs(6) } };
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
