
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationDeactivatedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationDeactivatedBuilder builder) {
        ApplicationDeactivated applicationDeactivated = builder.buildUnchecked();
        Assertions.assertThat(applicationDeactivated).isInstanceOf(ApplicationDeactivated.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ApplicationDeactivated.builder().severity("severity") },
                new Object[] { "message", ApplicationDeactivated.builder().message("message") },
                new Object[] { "correlationId", ApplicationDeactivated.builder().correlationId("correlationId") },
                new Object[] { "payload", ApplicationDeactivated.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        ApplicationDeactivated value = ApplicationDeactivated.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ApplicationDeactivated value = ApplicationDeactivated.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ApplicationDeactivated value = ApplicationDeactivated.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        ApplicationDeactivated value = ApplicationDeactivated.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
