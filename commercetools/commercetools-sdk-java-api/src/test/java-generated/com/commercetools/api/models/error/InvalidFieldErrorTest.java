
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidFieldErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidFieldErrorBuilder builder) {
        InvalidFieldError invalidFieldError = builder.buildUnchecked();
        Assertions.assertThat(invalidFieldError).isInstanceOf(InvalidFieldError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", InvalidFieldError.builder().message("message") },
                new Object[] { "field", InvalidFieldError.builder().field("field") },
                new Object[] { "invalidValue", InvalidFieldError.builder().invalidValue("invalidValue") },
                new Object[] { "allowedValues",
                        InvalidFieldError.builder().allowedValues(Collections.singletonList("allowedValues")) } };
    }

    @Test
    public void message() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void field() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void invalidValue() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setInvalidValue("invalidValue");
        Assertions.assertThat(value.getInvalidValue()).isEqualTo("invalidValue");
    }

    @Test
    public void allowedValues() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setAllowedValues(Collections.singletonList("allowedValues"));
        Assertions.assertThat(value.getAllowedValues()).isEqualTo(Collections.singletonList("allowedValues"));
    }
}
