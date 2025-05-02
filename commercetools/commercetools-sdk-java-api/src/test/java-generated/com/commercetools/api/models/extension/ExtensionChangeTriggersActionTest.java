
package com.commercetools.api.models.extension;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionChangeTriggersActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionChangeTriggersActionBuilder builder) {
        ExtensionChangeTriggersAction extensionChangeTriggersAction = builder.buildUnchecked();
        Assertions.assertThat(extensionChangeTriggersAction).isInstanceOf(ExtensionChangeTriggersAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "triggers", ExtensionChangeTriggersAction.builder()
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
