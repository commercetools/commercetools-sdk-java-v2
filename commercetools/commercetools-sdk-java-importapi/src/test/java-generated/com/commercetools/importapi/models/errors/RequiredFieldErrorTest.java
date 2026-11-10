
package com.commercetools.importapi.models.errors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RequiredFieldErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RequiredFieldErrorBuilder builder) {
        RequiredFieldError requiredFieldError = builder.buildUnchecked();
        Assertions.assertThat(requiredFieldError).isInstanceOf(RequiredFieldError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "field", RequiredFieldError.builder().field("field") } };
    }

    @Test
    public void field() {
        RequiredFieldError value = RequiredFieldError.of();
        value.setField("field");
        Assertions.assertThat(value.getField()).isEqualTo("field");
    }
}
