
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class InvalidLocaleTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, InvalidLocaleBuilder builder) {
        InvalidLocale invalidLocale = builder.buildUnchecked();
        Assertions.assertThat(invalidLocale).isInstanceOf(InvalidLocale.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", InvalidLocale.builder().severity("severity") },
                new Object[] { "message", InvalidLocale.builder().message("message") },
                new Object[] { "correlationId", InvalidLocale.builder().correlationId("correlationId") },
                new Object[] { "payload", InvalidLocale.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        InvalidLocale value = InvalidLocale.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        InvalidLocale value = InvalidLocale.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        InvalidLocale value = InvalidLocale.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        InvalidLocale value = InvalidLocale.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
