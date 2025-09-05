
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationNotAvailableTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationNotAvailableBuilder builder) {
        PaymentIntegrationNotAvailable paymentIntegrationNotAvailable = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationNotAvailable).isInstanceOf(PaymentIntegrationNotAvailable.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", PaymentIntegrationNotAvailable.builder().severity("severity") },
                new Object[] { "message", PaymentIntegrationNotAvailable.builder().message("message") },
                new Object[] { "correlationId",
                        PaymentIntegrationNotAvailable.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentIntegrationNotAvailable.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentIntegrationNotAvailable value = PaymentIntegrationNotAvailable.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentIntegrationNotAvailable value = PaymentIntegrationNotAvailable.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentIntegrationNotAvailable value = PaymentIntegrationNotAvailable.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentIntegrationNotAvailable value = PaymentIntegrationNotAvailable.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
