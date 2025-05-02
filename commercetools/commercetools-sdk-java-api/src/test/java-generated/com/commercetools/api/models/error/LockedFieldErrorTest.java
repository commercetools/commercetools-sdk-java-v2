
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LockedFieldErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LockedFieldErrorBuilder builder) {
        LockedFieldError lockedFieldError = builder.buildUnchecked();
        Assertions.assertThat(lockedFieldError).isInstanceOf(LockedFieldError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", LockedFieldError.builder().field("field") },
                new Object[] { "message", LockedFieldError.builder().message("message") } };
    }

    @Test
    public void field() {
        LockedFieldError value = LockedFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void message() {
        LockedFieldError value = LockedFieldError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
