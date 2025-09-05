
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidInputErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidInputErrorBuilder builder) {
        InvalidInputError invalidInputError = builder.buildUnchecked();
        Assertions.assertThat(invalidInputError).isInstanceOf(InvalidInputError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", InvalidInputError.builder().message("message") } };
    }

    @Test
    public void message() {
        InvalidInputError value = InvalidInputError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
