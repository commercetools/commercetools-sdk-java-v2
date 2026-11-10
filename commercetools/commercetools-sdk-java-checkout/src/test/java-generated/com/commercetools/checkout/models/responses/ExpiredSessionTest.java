
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpiredSessionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpiredSessionBuilder builder) {
        ExpiredSession expiredSession = builder.buildUnchecked();
        Assertions.assertThat(expiredSession).isInstanceOf(ExpiredSession.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ExpiredSession.builder().severity("severity") },
                new Object[] { "message", ExpiredSession.builder().message("message") },
                new Object[] { "correlationId", ExpiredSession.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpiredSession value = ExpiredSession.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpiredSession value = ExpiredSession.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ExpiredSession value = ExpiredSession.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
