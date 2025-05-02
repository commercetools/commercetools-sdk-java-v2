
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InternalConstraintViolatedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InternalConstraintViolatedErrorBuilder builder) {
        InternalConstraintViolatedError internalConstraintViolatedError = builder.buildUnchecked();
        Assertions.assertThat(internalConstraintViolatedError).isInstanceOf(InternalConstraintViolatedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", InternalConstraintViolatedError.builder().message("message") } };
    }

    @Test
    public void message() {
        InternalConstraintViolatedError value = InternalConstraintViolatedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
