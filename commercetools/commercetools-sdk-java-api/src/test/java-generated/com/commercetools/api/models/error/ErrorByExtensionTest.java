
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ErrorByExtensionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ErrorByExtensionBuilder builder) {
        ErrorByExtension errorByExtension = builder.buildUnchecked();
        Assertions.assertThat(errorByExtension).isInstanceOf(ErrorByExtension.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ErrorByExtension.builder().id("id") },
                new Object[] { "key", ErrorByExtension.builder().key("key") } };
    }

    @Test
    public void id() {
        ErrorByExtension value = ErrorByExtension.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ErrorByExtension value = ErrorByExtension.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
