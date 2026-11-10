
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidCredentialsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidCredentialsErrorBuilder builder) {
        InvalidCredentialsError invalidCredentialsError = builder.buildUnchecked();
        Assertions.assertThat(invalidCredentialsError).isInstanceOf(InvalidCredentialsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", InvalidCredentialsError.builder().message("message") } };
    }

    @Test
    public void message() {
        InvalidCredentialsError value = InvalidCredentialsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
