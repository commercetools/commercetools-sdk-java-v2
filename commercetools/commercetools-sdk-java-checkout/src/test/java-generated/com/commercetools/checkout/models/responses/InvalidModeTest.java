
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidModeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidModeBuilder builder) {
        InvalidMode invalidMode = builder.buildUnchecked();
        Assertions.assertThat(invalidMode).isInstanceOf(InvalidMode.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", InvalidMode.builder().severity("severity") },
                new Object[] { "message", InvalidMode.builder().message("message") },
                new Object[] { "correlationId", InvalidMode.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        InvalidMode value = InvalidMode.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        InvalidMode value = InvalidMode.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        InvalidMode value = InvalidMode.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
