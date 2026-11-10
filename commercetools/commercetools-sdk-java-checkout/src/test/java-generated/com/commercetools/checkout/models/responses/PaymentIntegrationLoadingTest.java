
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationLoadingTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationLoadingBuilder builder) {
        PaymentIntegrationLoading paymentIntegrationLoading = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationLoading).isInstanceOf(PaymentIntegrationLoading.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentIntegrationLoading.builder().severity("severity") },
                new Object[] { "message", PaymentIntegrationLoading.builder().message("message") },
                new Object[] { "correlationId", PaymentIntegrationLoading.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentIntegrationLoading.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentIntegrationLoading value = PaymentIntegrationLoading.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentIntegrationLoading value = PaymentIntegrationLoading.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentIntegrationLoading value = PaymentIntegrationLoading.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentIntegrationLoading value = PaymentIntegrationLoading.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
