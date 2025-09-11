
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NonOrderableCartErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NonOrderableCartErrorBuilder builder) {
        NonOrderableCartError nonOrderableCartError = builder.buildUnchecked();
        Assertions.assertThat(nonOrderableCartError).isInstanceOf(NonOrderableCartError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", NonOrderableCartError.builder().severity("severity") },
                new Object[] { "message", NonOrderableCartError.builder().message("message") },
                new Object[] { "correlationId", NonOrderableCartError.builder().correlationId("correlationId") },
                new Object[] { "payload", NonOrderableCartError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        NonOrderableCartError value = NonOrderableCartError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        NonOrderableCartError value = NonOrderableCartError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        NonOrderableCartError value = NonOrderableCartError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        NonOrderableCartError value = NonOrderableCartError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
