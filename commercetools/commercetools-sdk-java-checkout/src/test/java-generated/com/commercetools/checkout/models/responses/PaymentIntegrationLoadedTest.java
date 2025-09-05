
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationLoadedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationLoadedBuilder builder) {
        PaymentIntegrationLoaded paymentIntegrationLoaded = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationLoaded).isInstanceOf(PaymentIntegrationLoaded.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", PaymentIntegrationLoaded.builder().severity("severity") },
                new Object[] { "message", PaymentIntegrationLoaded.builder().message("message") },
                new Object[] { "correlationId", PaymentIntegrationLoaded.builder().correlationId("correlationId") },
                new Object[] { "payload", PaymentIntegrationLoaded.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        PaymentIntegrationLoaded value = PaymentIntegrationLoaded.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        PaymentIntegrationLoaded value = PaymentIntegrationLoaded.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        PaymentIntegrationLoaded value = PaymentIntegrationLoaded.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        PaymentIntegrationLoaded value = PaymentIntegrationLoaded.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
