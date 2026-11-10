
package com.commercetools.importapi.models.errors;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidFieldsUpdateErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidFieldsUpdateErrorBuilder builder) {
        InvalidFieldsUpdateError invalidFieldsUpdateError = builder.buildUnchecked();
        Assertions.assertThat(invalidFieldsUpdateError).isInstanceOf(InvalidFieldsUpdateError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", InvalidFieldsUpdateError.builder().message("message") },
                new Object[] { "fields",
                        InvalidFieldsUpdateError.builder().fields(Collections.singletonList("fields")) } };
    }

    @Test
    public void message() {
        InvalidFieldsUpdateError value = InvalidFieldsUpdateError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void fields() {
        InvalidFieldsUpdateError value = InvalidFieldsUpdateError.of();
        value.setFields(Collections.singletonList("fields"));
        Assertions.assertThat(value.getFields()).isEqualTo(Collections.singletonList("fields"));
    }
}
