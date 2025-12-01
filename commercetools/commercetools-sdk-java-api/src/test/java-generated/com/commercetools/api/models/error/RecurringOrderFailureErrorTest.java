
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderFailureErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderFailureErrorBuilder builder) {
        RecurringOrderFailureError recurringOrderFailureError = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderFailureError).isInstanceOf(RecurringOrderFailureError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", RecurringOrderFailureError.builder().message("message") },
                new Object[] { "details", RecurringOrderFailureError.builder().details("details") } };
    }

    @Test
    public void message() {
        RecurringOrderFailureError value = RecurringOrderFailureError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void details() {
        RecurringOrderFailureError value = RecurringOrderFailureError.of();
        value.setDetails("details");
        Assertions.assertThat(value.getDetails()).isEqualTo("details");
    }
}
