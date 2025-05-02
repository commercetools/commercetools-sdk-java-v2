
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ContentTooLargeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ContentTooLargeErrorBuilder builder) {
        ContentTooLargeError contentTooLargeError = builder.buildUnchecked();
        Assertions.assertThat(contentTooLargeError).isInstanceOf(ContentTooLargeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ContentTooLargeError.builder().message("message") } };
    }

    @Test
    public void message() {
        ContentTooLargeError value = ContentTooLargeError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
