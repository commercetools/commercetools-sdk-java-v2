
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationSelectedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationSelectedBuilder builder) {
        PaymentIntegrationSelected paymentIntegrationSelected = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationSelected).isInstanceOf(PaymentIntegrationSelected.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentIntegrationSelected.builder().severity("severity") },
                new Object[] { "message", PaymentIntegrationSelected.builder().message("message") },
                new Object[] { "correlationId", PaymentIntegrationSelected.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentIntegrationSelected.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentIntegrationSelected value = PaymentIntegrationSelected.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentIntegrationSelected value = PaymentIntegrationSelected.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentIntegrationSelected value = PaymentIntegrationSelected.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentIntegrationSelected value = PaymentIntegrationSelected.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
