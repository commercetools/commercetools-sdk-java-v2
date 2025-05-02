
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ObjectNotFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ObjectNotFoundErrorBuilder builder) {
        ObjectNotFoundError objectNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(objectNotFoundError).isInstanceOf(ObjectNotFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ObjectNotFoundError.builder().message("message") } };
    }

    @Test
    public void message() {
        ObjectNotFoundError value = ObjectNotFoundError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
