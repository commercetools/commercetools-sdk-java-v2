
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionChainTooDeepErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionChainTooDeepErrorBuilder builder) {
        ExtensionChainTooDeepError extensionChainTooDeepError = builder.buildUnchecked();
        Assertions.assertThat(extensionChainTooDeepError).isInstanceOf(ExtensionChainTooDeepError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ExtensionChainTooDeepError.builder().message("message") } };
    }

    @Test
    public void message() {
        ExtensionChainTooDeepError value = ExtensionChainTooDeepError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
