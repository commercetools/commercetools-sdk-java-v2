
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MissingDependencyErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MissingDependencyErrorBuilder builder) {
        MissingDependencyError missingDependencyError = builder.buildUnchecked();
        Assertions.assertThat(missingDependencyError).isInstanceOf(MissingDependencyError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", MissingDependencyError.builder().message("message") } };
    }

    @Test
    public void message() {
        MissingDependencyError value = MissingDependencyError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
