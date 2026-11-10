
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionNoResponseErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionNoResponseErrorBuilder builder) {
        ExtensionNoResponseError extensionNoResponseError = builder.buildUnchecked();
        Assertions.assertThat(extensionNoResponseError).isInstanceOf(ExtensionNoResponseError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ExtensionNoResponseError.builder().message("message") },
                new Object[] { "extensionId", ExtensionNoResponseError.builder().extensionId("extensionId") },
                new Object[] { "extensionKey", ExtensionNoResponseError.builder().extensionKey("extensionKey") } };
    }

    @Test
    public void message() {
        ExtensionNoResponseError value = ExtensionNoResponseError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void extensionId() {
        ExtensionNoResponseError value = ExtensionNoResponseError.of();
        value.setExtensionId("extensionId");
        Assertions.assertThat(value.getExtensionId()).isEqualTo("extensionId");
    }

    @Test
    public void extensionKey() {
        ExtensionNoResponseError value = ExtensionNoResponseError.of();
        value.setExtensionKey("extensionKey");
        Assertions.assertThat(value.getExtensionKey()).isEqualTo("extensionKey");
    }
}
