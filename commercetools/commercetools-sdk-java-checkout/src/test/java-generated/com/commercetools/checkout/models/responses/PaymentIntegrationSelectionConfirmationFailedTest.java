
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationSelectionConfirmationFailedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationSelectionConfirmationFailedBuilder builder) {
        PaymentIntegrationSelectionConfirmationFailed paymentIntegrationSelectionConfirmationFailed = builder
                .buildUnchecked();
        Assertions.assertThat(paymentIntegrationSelectionConfirmationFailed)
                .isInstanceOf(PaymentIntegrationSelectionConfirmationFailed.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity",
                        PaymentIntegrationSelectionConfirmationFailed.builder().severity("severity") },
                new Object[] { "message", PaymentIntegrationSelectionConfirmationFailed.builder().message("message") },
                new Object[] { "correlationId",
                        PaymentIntegrationSelectionConfirmationFailed.builder().correlationId("correlationId") },
                new Object[] { "payload",
                        PaymentIntegrationSelectionConfirmationFailed.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentIntegrationSelectionConfirmationFailed value = PaymentIntegrationSelectionConfirmationFailed.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentIntegrationSelectionConfirmationFailed value = PaymentIntegrationSelectionConfirmationFailed.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentIntegrationSelectionConfirmationFailed value = PaymentIntegrationSelectionConfirmationFailed.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentIntegrationSelectionConfirmationFailed value = PaymentIntegrationSelectionConfirmationFailed.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
