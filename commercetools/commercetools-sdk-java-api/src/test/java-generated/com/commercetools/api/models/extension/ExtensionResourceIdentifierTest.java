
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionResourceIdentifierTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionResourceIdentifierBuilder builder) {
        ExtensionResourceIdentifier extensionResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(extensionResourceIdentifier).isInstanceOf(ExtensionResourceIdentifier.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ExtensionResourceIdentifier.builder().id("id") },
                new Object[] { "key", ExtensionResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ExtensionResourceIdentifier value = ExtensionResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ExtensionResourceIdentifier value = ExtensionResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
