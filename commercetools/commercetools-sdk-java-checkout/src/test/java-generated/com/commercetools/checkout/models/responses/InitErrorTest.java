
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InitErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InitErrorBuilder builder) {
        InitError initError = builder.buildUnchecked();
        Assertions.assertThat(initError).isInstanceOf(InitError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", InitError.builder().severity("severity") },
                new Object[] { "message", InitError.builder().message("message") },
                new Object[] { "correlationId", InitError.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        InitError value = InitError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        InitError value = InitError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        InitError value = InitError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
