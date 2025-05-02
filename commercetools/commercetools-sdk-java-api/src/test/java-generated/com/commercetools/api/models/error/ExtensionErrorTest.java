
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionErrorBuilder builder) {
        ExtensionError extensionError = builder.buildUnchecked();
        Assertions.assertThat(extensionError).isInstanceOf(ExtensionError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", ExtensionError.builder().code("code") },
                new Object[] { "message", ExtensionError.builder().message("message") },
                new Object[] { "extensionId", ExtensionError.builder().extensionId("extensionId") },
                new Object[] { "extensionKey", ExtensionError.builder().extensionKey("extensionKey") } };
    }

    @Test
    public void code() {
        ExtensionError value = ExtensionError.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void message() {
        ExtensionError value = ExtensionError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void extensionId() {
        ExtensionError value = ExtensionError.of();
        value.setExtensionId("extensionId");
        Assertions.assertThat(value.getExtensionId()).isEqualTo("extensionId");
    }

    @Test
    public void extensionKey() {
        ExtensionError value = ExtensionError.of();
        value.setExtensionKey("extensionKey");
        Assertions.assertThat(value.getExtensionKey()).isEqualTo("extensionKey");
    }
}
