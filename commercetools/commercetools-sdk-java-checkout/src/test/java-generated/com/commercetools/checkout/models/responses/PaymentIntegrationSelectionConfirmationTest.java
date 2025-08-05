
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationSelectionConfirmationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationSelectionConfirmationBuilder builder) {
        PaymentIntegrationSelectionConfirmation paymentIntegrationSelectionConfirmation = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationSelectionConfirmation)
                .isInstanceOf(PaymentIntegrationSelectionConfirmation.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", PaymentIntegrationSelectionConfirmation.builder().severity("severity") },
                new Object[] { "message", PaymentIntegrationSelectionConfirmation.builder().message("message") },
                new Object[] { "correlationId",
                        PaymentIntegrationSelectionConfirmation.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentIntegrationSelectionConfirmation.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentIntegrationSelectionConfirmation value = PaymentIntegrationSelectionConfirmation.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentIntegrationSelectionConfirmation value = PaymentIntegrationSelectionConfirmation.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentIntegrationSelectionConfirmation value = PaymentIntegrationSelectionConfirmation.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentIntegrationSelectionConfirmation value = PaymentIntegrationSelectionConfirmation.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
