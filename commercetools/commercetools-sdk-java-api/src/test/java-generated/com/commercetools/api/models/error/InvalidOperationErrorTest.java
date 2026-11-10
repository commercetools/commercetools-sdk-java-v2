
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidOperationErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidOperationErrorBuilder builder) {
        InvalidOperationError invalidOperationError = builder.buildUnchecked();
        Assertions.assertThat(invalidOperationError).isInstanceOf(InvalidOperationError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", InvalidOperationError.builder().message("message") } };
    }

    @Test
    public void message() {
        InvalidOperationError value = InvalidOperationError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
