
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpressPaymentCancelledTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpressPaymentCancelledBuilder builder) {
        ExpressPaymentCancelled expressPaymentCancelled = builder.buildUnchecked();
        Assertions.assertThat(expressPaymentCancelled).isInstanceOf(ExpressPaymentCancelled.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ExpressPaymentCancelled.builder().severity("severity") },
                new Object[] { "message", ExpressPaymentCancelled.builder().message("message") },
                new Object[] { "payload", ExpressPaymentCancelled.builder().payload("payload") },
                new Object[] { "correlationId", ExpressPaymentCancelled.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpressPaymentCancelled value = ExpressPaymentCancelled.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpressPaymentCancelled value = ExpressPaymentCancelled.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void payload() {
        ExpressPaymentCancelled value = ExpressPaymentCancelled.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }

    @Test
    public void correlationId() {
        ExpressPaymentCancelled value = ExpressPaymentCancelled.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
