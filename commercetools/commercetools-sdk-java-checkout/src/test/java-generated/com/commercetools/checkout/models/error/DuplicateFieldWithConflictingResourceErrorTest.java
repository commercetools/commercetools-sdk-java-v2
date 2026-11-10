
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicateFieldWithConflictingResourceErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicateFieldWithConflictingResourceErrorBuilder builder) {
        DuplicateFieldWithConflictingResourceError duplicateFieldWithConflictingResourceError = builder
                .buildUnchecked();
        Assertions.assertThat(duplicateFieldWithConflictingResourceError)
                .isInstanceOf(DuplicateFieldWithConflictingResourceError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", DuplicateFieldWithConflictingResourceError.builder().message("message") } };
    }

    @Test
    public void message() {
        DuplicateFieldWithConflictingResourceError value = DuplicateFieldWithConflictingResourceError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
