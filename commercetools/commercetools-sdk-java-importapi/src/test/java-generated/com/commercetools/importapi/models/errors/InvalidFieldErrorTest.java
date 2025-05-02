
package com.commercetools.importapi.models.errors;

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
        return new Object[][] { new Object[] { "field", InvalidFieldError.builder().field("field") },
                new Object[] { "invalidValue", InvalidFieldError.builder().invalidValue("invalidValue") },
                new Object[] { "allowedValues",
                        InvalidFieldError.builder().allowedValues(Collections.singletonList("allowedValues")) },
                new Object[] { "resourceIndex", InvalidFieldError.builder().resourceIndex(4L) } };
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

    @Test
    public void resourceIndex() {
        InvalidFieldError value = InvalidFieldError.of();
        value.setResourceIndex(4L);
        Assertions.assertThat(value.getResourceIndex()).isEqualTo(4L);
    }
}
