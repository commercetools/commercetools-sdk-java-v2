
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidJsonInputErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidJsonInputErrorBuilder builder) {
        InvalidJsonInputError invalidJsonInputError = builder.buildUnchecked();
        Assertions.assertThat(invalidJsonInputError).isInstanceOf(InvalidJsonInputError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", InvalidJsonInputError.builder().message("message") },
                new Object[] { "detailedErrorMessage",
                        InvalidJsonInputError.builder().detailedErrorMessage("detailedErrorMessage") } };
    }

    @Test
    public void message() {
        InvalidJsonInputError value = InvalidJsonInputError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void detailedErrorMessage() {
        InvalidJsonInputError value = InvalidJsonInputError.of();
        value.setDetailedErrorMessage("detailedErrorMessage");
        Assertions.assertThat(value.getDetailedErrorMessage()).isEqualTo("detailedErrorMessage");
    }
}
