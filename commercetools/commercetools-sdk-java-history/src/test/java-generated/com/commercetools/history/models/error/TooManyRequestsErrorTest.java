
package com.commercetools.history.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TooManyRequestsErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TooManyRequestsErrorBuilder builder) {
        TooManyRequestsError tooManyRequestsError = builder.buildUnchecked();
        Assertions.assertThat(tooManyRequestsError).isInstanceOf(TooManyRequestsError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "code", TooManyRequestsError.builder().code("code") },
                new Object[] { "message", TooManyRequestsError.builder().message("message") } };
    }

    @Test
    public void code() {
        TooManyRequestsError value = TooManyRequestsError.of();
        value.setCode("code");
        Assertions.assertThat(value.getCode()).isEqualTo("code");
    }

    @Test
    public void message() {
        TooManyRequestsError value = TooManyRequestsError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
