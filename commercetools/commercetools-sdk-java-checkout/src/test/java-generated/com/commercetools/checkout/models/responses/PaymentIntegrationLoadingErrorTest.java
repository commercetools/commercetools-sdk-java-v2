
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationLoadingErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationLoadingErrorBuilder builder) {
        PaymentIntegrationLoadingError paymentIntegrationLoadingError = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationLoadingError).isInstanceOf(PaymentIntegrationLoadingError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", PaymentIntegrationLoadingError.builder().severity("severity") },
                new Object[] { "message", PaymentIntegrationLoadingError.builder().message("message") },
                new Object[] { "correlationId",
                        PaymentIntegrationLoadingError.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentIntegrationLoadingError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentIntegrationLoadingError value = PaymentIntegrationLoadingError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentIntegrationLoadingError value = PaymentIntegrationLoadingError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentIntegrationLoadingError value = PaymentIntegrationLoadingError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentIntegrationLoadingError value = PaymentIntegrationLoadingError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
