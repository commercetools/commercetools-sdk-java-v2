
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UnavailableLocaleTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UnavailableLocaleBuilder builder) {
        UnavailableLocale unavailableLocale = builder.buildUnchecked();
        Assertions.assertThat(unavailableLocale).isInstanceOf(UnavailableLocale.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", UnavailableLocale.builder().severity("severity") },
                new Object[] { "message", UnavailableLocale.builder().message("message") },
                new Object[] { "correlationId", UnavailableLocale.builder().correlationId("correlationId") },
                new Object[] { "payload", UnavailableLocale.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        UnavailableLocale value = UnavailableLocale.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        UnavailableLocale value = UnavailableLocale.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        UnavailableLocale value = UnavailableLocale.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        UnavailableLocale value = UnavailableLocale.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
