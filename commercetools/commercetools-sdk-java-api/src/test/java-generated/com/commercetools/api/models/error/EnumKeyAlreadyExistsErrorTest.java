
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumKeyAlreadyExistsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumKeyAlreadyExistsErrorBuilder builder) {
        EnumKeyAlreadyExistsError enumKeyAlreadyExistsError = builder.buildUnchecked();
        Assertions.assertThat(enumKeyAlreadyExistsError).isInstanceOf(EnumKeyAlreadyExistsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", EnumKeyAlreadyExistsError.builder().message("message") },
                new Object[] { "conflictingEnumKey",
                        EnumKeyAlreadyExistsError.builder().conflictingEnumKey("conflictingEnumKey") },
                new Object[] { "conflictingAttributeName",
                        EnumKeyAlreadyExistsError.builder().conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void message() {
        EnumKeyAlreadyExistsError value = EnumKeyAlreadyExistsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingEnumKey() {
        EnumKeyAlreadyExistsError value = EnumKeyAlreadyExistsError.of();
        value.setConflictingEnumKey("conflictingEnumKey");
        Assertions.assertThat(value.getConflictingEnumKey()).isEqualTo("conflictingEnumKey");
    }

    @Test
    public void conflictingAttributeName() {
        EnumKeyAlreadyExistsError value = EnumKeyAlreadyExistsError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
