
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GeneralErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GeneralErrorBuilder builder) {
        GeneralError generalError = builder.buildUnchecked();
        Assertions.assertThat(generalError).isInstanceOf(GeneralError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", GeneralError.builder().message("message") } };
    }

    @Test
    public void message() {
        GeneralError value = GeneralError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
