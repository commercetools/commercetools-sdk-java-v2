
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SemanticErrorErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SemanticErrorErrorBuilder builder) {
        SemanticErrorError semanticErrorError = builder.buildUnchecked();
        Assertions.assertThat(semanticErrorError).isInstanceOf(SemanticErrorError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", SemanticErrorError.builder().message("message") } };
    }

    @Test
    public void message() {
        SemanticErrorError value = SemanticErrorError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
