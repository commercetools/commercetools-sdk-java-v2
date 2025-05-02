
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OverCapacityErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OverCapacityErrorBuilder builder) {
        OverCapacityError overCapacityError = builder.buildUnchecked();
        Assertions.assertThat(overCapacityError).isInstanceOf(OverCapacityError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", OverCapacityError.builder().message("message") } };
    }

    @Test
    public void message() {
        OverCapacityError value = OverCapacityError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
