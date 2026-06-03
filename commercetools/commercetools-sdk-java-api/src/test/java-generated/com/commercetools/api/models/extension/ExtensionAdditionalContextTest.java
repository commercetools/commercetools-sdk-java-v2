
package com.commercetools.api.models.extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionAdditionalContextTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionAdditionalContextBuilder builder) {
        ExtensionAdditionalContext extensionAdditionalContext = builder.buildUnchecked();
        Assertions.assertThat(extensionAdditionalContext).isInstanceOf(ExtensionAdditionalContext.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "includeOldResource", ExtensionAdditionalContext.builder().includeOldResource(true) } };
    }

    @Test
    public void includeOldResource() {
        ExtensionAdditionalContext value = ExtensionAdditionalContext.of();
        value.setIncludeOldResource(true);
        Assertions.assertThat(value.getIncludeOldResource()).isEqualTo(true);
    }
}
