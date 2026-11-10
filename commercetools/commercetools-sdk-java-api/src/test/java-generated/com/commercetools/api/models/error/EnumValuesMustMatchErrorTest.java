
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class EnumValuesMustMatchErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, EnumValuesMustMatchErrorBuilder builder) {
        EnumValuesMustMatchError enumValuesMustMatchError = builder.buildUnchecked();
        Assertions.assertThat(enumValuesMustMatchError).isInstanceOf(EnumValuesMustMatchError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", EnumValuesMustMatchError.builder().message("message") } };
    }

    @Test
    public void message() {
        EnumValuesMustMatchError value = EnumValuesMustMatchError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
