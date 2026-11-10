
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidCurrentPasswordErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidCurrentPasswordErrorBuilder builder) {
        InvalidCurrentPasswordError invalidCurrentPasswordError = builder.buildUnchecked();
        Assertions.assertThat(invalidCurrentPasswordError).isInstanceOf(InvalidCurrentPasswordError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", InvalidCurrentPasswordError.builder().message("message") } };
    }

    @Test
    public void message() {
        InvalidCurrentPasswordError value = InvalidCurrentPasswordError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
