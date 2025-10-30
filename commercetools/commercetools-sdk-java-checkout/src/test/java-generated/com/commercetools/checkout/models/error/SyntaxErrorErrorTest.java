
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SyntaxErrorErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SyntaxErrorErrorBuilder builder) {
        SyntaxErrorError syntaxErrorError = builder.buildUnchecked();
        Assertions.assertThat(syntaxErrorError).isInstanceOf(SyntaxErrorError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", SyntaxErrorError.builder().message("message") } };
    }

    @Test
    public void message() {
        SyntaxErrorError value = SyntaxErrorError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
