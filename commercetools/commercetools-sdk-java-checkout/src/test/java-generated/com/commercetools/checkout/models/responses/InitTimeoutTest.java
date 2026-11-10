
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InitTimeoutTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InitTimeoutBuilder builder) {
        InitTimeout initTimeout = builder.buildUnchecked();
        Assertions.assertThat(initTimeout).isInstanceOf(InitTimeout.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", InitTimeout.builder().severity("severity") },
                new Object[] { "message", InitTimeout.builder().message("message") },
                new Object[] { "correlationId", InitTimeout.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        InitTimeout value = InitTimeout.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        InitTimeout value = InitTimeout.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        InitTimeout value = InitTimeout.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
