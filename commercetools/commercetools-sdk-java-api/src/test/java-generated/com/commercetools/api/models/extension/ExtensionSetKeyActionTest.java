
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionSetKeyActionBuilder builder) {
        ExtensionSetKeyAction extensionSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(extensionSetKeyAction).isInstanceOf(ExtensionSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ExtensionSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ExtensionSetKeyAction value = ExtensionSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
