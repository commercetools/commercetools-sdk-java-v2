
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionChainTooWideErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionChainTooWideErrorBuilder builder) {
        ExtensionChainTooWideError extensionChainTooWideError = builder.buildUnchecked();
        Assertions.assertThat(extensionChainTooWideError).isInstanceOf(ExtensionChainTooWideError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ExtensionChainTooWideError.builder().message("message") } };
    }

    @Test
    public void message() {
        ExtensionChainTooWideError value = ExtensionChainTooWideError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
