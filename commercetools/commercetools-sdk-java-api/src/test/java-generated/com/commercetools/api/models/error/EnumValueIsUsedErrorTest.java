
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumValueIsUsedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumValueIsUsedErrorBuilder builder) {
        EnumValueIsUsedError enumValueIsUsedError = builder.buildUnchecked();
        Assertions.assertThat(enumValueIsUsedError).isInstanceOf(EnumValueIsUsedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", EnumValueIsUsedError.builder().message("message") } };
    }

    @Test
    public void message() {
        EnumValueIsUsedError value = EnumValueIsUsedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
