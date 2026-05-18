
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpressPaymentStartedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpressPaymentStartedBuilder builder) {
        ExpressPaymentStarted expressPaymentStarted = builder.buildUnchecked();
        Assertions.assertThat(expressPaymentStarted).isInstanceOf(ExpressPaymentStarted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ExpressPaymentStarted.builder().severity("severity") },
                new Object[] { "message", ExpressPaymentStarted.builder().message("message") },
                new Object[] { "payload", ExpressPaymentStarted.builder().payload("payload") },
                new Object[] { "correlationId", ExpressPaymentStarted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpressPaymentStarted value = ExpressPaymentStarted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpressPaymentStarted value = ExpressPaymentStarted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void payload() {
        ExpressPaymentStarted value = ExpressPaymentStarted.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }

    @Test
    public void correlationId() {
        ExpressPaymentStarted value = ExpressPaymentStarted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
