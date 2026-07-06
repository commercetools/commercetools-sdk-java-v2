
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpressPaymentCompletedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpressPaymentCompletedBuilder builder) {
        ExpressPaymentCompleted expressPaymentCompleted = builder.buildUnchecked();
        Assertions.assertThat(expressPaymentCompleted).isInstanceOf(ExpressPaymentCompleted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ExpressPaymentCompleted.builder().severity("severity") },
                new Object[] { "message", ExpressPaymentCompleted.builder().message("message") },
                new Object[] { "payload", ExpressPaymentCompleted.builder().payload("payload") },
                new Object[] { "correlationId", ExpressPaymentCompleted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpressPaymentCompleted value = ExpressPaymentCompleted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpressPaymentCompleted value = ExpressPaymentCompleted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void payload() {
        ExpressPaymentCompleted value = ExpressPaymentCompleted.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }

    @Test
    public void correlationId() {
        ExpressPaymentCompleted value = ExpressPaymentCompleted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
