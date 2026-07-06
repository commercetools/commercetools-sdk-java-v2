
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtensionDependencyExistsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExtensionDependencyExistsErrorBuilder builder) {
        ExtensionDependencyExistsError extensionDependencyExistsError = builder.buildUnchecked();
        Assertions.assertThat(extensionDependencyExistsError).isInstanceOf(ExtensionDependencyExistsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ExtensionDependencyExistsError.builder().message("message") } };
    }

    @Test
    public void message() {
        ExtensionDependencyExistsError value = ExtensionDependencyExistsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
