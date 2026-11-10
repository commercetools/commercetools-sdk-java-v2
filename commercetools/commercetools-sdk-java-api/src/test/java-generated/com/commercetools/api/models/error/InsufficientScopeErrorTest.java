
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InsufficientScopeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InsufficientScopeErrorBuilder builder) {
        InsufficientScopeError insufficientScopeError = builder.buildUnchecked();
        Assertions.assertThat(insufficientScopeError).isInstanceOf(InsufficientScopeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", InsufficientScopeError.builder().message("message") } };
    }

    @Test
    public void message() {
        InsufficientScopeError value = InsufficientScopeError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
