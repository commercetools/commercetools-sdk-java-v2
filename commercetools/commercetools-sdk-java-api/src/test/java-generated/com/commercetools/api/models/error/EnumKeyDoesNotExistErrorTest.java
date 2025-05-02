
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumKeyDoesNotExistErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumKeyDoesNotExistErrorBuilder builder) {
        EnumKeyDoesNotExistError enumKeyDoesNotExistError = builder.buildUnchecked();
        Assertions.assertThat(enumKeyDoesNotExistError).isInstanceOf(EnumKeyDoesNotExistError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", EnumKeyDoesNotExistError.builder().message("message") },
                new Object[] { "conflictingEnumKey",
                        EnumKeyDoesNotExistError.builder().conflictingEnumKey("conflictingEnumKey") },
                new Object[] { "conflictingAttributeName",
                        EnumKeyDoesNotExistError.builder().conflictingAttributeName("conflictingAttributeName") } };
    }

    @Test
    public void message() {
        EnumKeyDoesNotExistError value = EnumKeyDoesNotExistError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void conflictingEnumKey() {
        EnumKeyDoesNotExistError value = EnumKeyDoesNotExistError.of();
        value.setConflictingEnumKey("conflictingEnumKey");
        Assertions.assertThat(value.getConflictingEnumKey()).isEqualTo("conflictingEnumKey");
    }

    @Test
    public void conflictingAttributeName() {
        EnumKeyDoesNotExistError value = EnumKeyDoesNotExistError.of();
        value.setConflictingAttributeName("conflictingAttributeName");
        Assertions.assertThat(value.getConflictingAttributeName()).isEqualTo("conflictingAttributeName");
    }
}
