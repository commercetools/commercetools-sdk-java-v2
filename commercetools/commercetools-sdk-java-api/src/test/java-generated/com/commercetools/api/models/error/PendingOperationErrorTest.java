
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PendingOperationErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PendingOperationErrorBuilder builder) {
        PendingOperationError pendingOperationError = builder.buildUnchecked();
        Assertions.assertThat(pendingOperationError).isInstanceOf(PendingOperationError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", PendingOperationError.builder().message("message") } };
    }

    @Test
    public void message() {
        PendingOperationError value = PendingOperationError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
