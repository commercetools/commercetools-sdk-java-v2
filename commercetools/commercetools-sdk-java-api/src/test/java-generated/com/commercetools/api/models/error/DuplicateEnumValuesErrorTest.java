
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DuplicateEnumValuesErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DuplicateEnumValuesErrorBuilder builder) {
        DuplicateEnumValuesError duplicateEnumValuesError = builder.buildUnchecked();
        Assertions.assertThat(duplicateEnumValuesError).isInstanceOf(DuplicateEnumValuesError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", DuplicateEnumValuesError.builder().message("message") },
                new Object[] { "duplicates",
                        DuplicateEnumValuesError.builder().duplicates(Collections.singletonList("duplicates")) } };
    }

    @Test
    public void message() {
        DuplicateEnumValuesError value = DuplicateEnumValuesError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void duplicates() {
        DuplicateEnumValuesError value = DuplicateEnumValuesError.of();
        value.setDuplicates(Collections.singletonList("duplicates"));
        Assertions.assertThat(value.getDuplicates()).isEqualTo(Collections.singletonList("duplicates"));
    }
}
