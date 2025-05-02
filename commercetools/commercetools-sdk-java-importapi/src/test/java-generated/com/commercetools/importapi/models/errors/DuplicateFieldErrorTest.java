
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicateFieldErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicateFieldErrorBuilder builder) {
        DuplicateFieldError duplicateFieldError = builder.buildUnchecked();
        Assertions.assertThat(duplicateFieldError).isInstanceOf(DuplicateFieldError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", DuplicateFieldError.builder().field("field") },
                new Object[] { "duplicateValue", DuplicateFieldError.builder().duplicateValue("duplicateValue") } };
    }

    @Test
    public void field() {
        DuplicateFieldError value = DuplicateFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }

    @Test
    public void duplicateValue() {
        DuplicateFieldError value = DuplicateFieldError.of();
        value.setDuplicateValue("duplicateValue");
        Assertions.assertThat(value.getDuplicateValue()).isEqualTo("duplicateValue");
    }
}
