
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MissingProjectKeyErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MissingProjectKeyErrorBuilder builder) {
        MissingProjectKeyError missingProjectKeyError = builder.buildUnchecked();
        Assertions.assertThat(missingProjectKeyError).isInstanceOf(MissingProjectKeyError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", MissingProjectKeyError.builder().message("message") } };
    }

    @Test
    public void message() {
        MissingProjectKeyError value = MissingProjectKeyError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
