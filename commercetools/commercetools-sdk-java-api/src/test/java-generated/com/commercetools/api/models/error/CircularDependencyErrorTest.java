
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CircularDependencyErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CircularDependencyErrorBuilder builder) {
        CircularDependencyError circularDependencyError = builder.buildUnchecked();
        Assertions.assertThat(circularDependencyError).isInstanceOf(CircularDependencyError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", CircularDependencyError.builder().message("message") } };
    }

    @Test
    public void message() {
        CircularDependencyError value = CircularDependencyError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
