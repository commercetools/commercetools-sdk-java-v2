
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AnonymousIdAlreadyInUseErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AnonymousIdAlreadyInUseErrorBuilder builder) {
        AnonymousIdAlreadyInUseError anonymousIdAlreadyInUseError = builder.buildUnchecked();
        Assertions.assertThat(anonymousIdAlreadyInUseError).isInstanceOf(AnonymousIdAlreadyInUseError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AnonymousIdAlreadyInUseError.builder().message("message") } };
    }

    @Test
    public void message() {
        AnonymousIdAlreadyInUseError value = AnonymousIdAlreadyInUseError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
