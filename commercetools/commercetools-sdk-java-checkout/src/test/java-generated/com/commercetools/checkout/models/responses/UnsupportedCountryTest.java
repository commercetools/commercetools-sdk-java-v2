
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UnsupportedCountryTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UnsupportedCountryBuilder builder) {
        UnsupportedCountry unsupportedCountry = builder.buildUnchecked();
        Assertions.assertThat(unsupportedCountry).isInstanceOf(UnsupportedCountry.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", UnsupportedCountry.builder().severity("severity") },
                new Object[] { "message", UnsupportedCountry.builder().message("message") },
                new Object[] { "correlationId", UnsupportedCountry.builder().correlationId("correlationId") },
                new Object[] { "payload", UnsupportedCountry.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        UnsupportedCountry value = UnsupportedCountry.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        UnsupportedCountry value = UnsupportedCountry.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        UnsupportedCountry value = UnsupportedCountry.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        UnsupportedCountry value = UnsupportedCountry.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
