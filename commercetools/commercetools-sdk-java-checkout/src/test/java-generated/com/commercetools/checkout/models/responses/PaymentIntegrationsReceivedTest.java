
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationsReceivedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationsReceivedBuilder builder) {
        PaymentIntegrationsReceived paymentIntegrationsReceived = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationsReceived).isInstanceOf(PaymentIntegrationsReceived.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentIntegrationsReceived.builder().severity("severity") },
                new Object[] { "message", PaymentIntegrationsReceived.builder().message("message") },
                new Object[] { "correlationId", PaymentIntegrationsReceived.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentIntegrationsReceived.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentIntegrationsReceived value = PaymentIntegrationsReceived.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentIntegrationsReceived value = PaymentIntegrationsReceived.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentIntegrationsReceived value = PaymentIntegrationsReceived.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentIntegrationsReceived value = PaymentIntegrationsReceived.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
