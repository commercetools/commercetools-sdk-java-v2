
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpressPaymentIntegrationNotAvailableTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpressPaymentIntegrationNotAvailableBuilder builder) {
        ExpressPaymentIntegrationNotAvailable expressPaymentIntegrationNotAvailable = builder.buildUnchecked();
        Assertions.assertThat(expressPaymentIntegrationNotAvailable)
                .isInstanceOf(ExpressPaymentIntegrationNotAvailable.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", ExpressPaymentIntegrationNotAvailable.builder().severity("severity") },
                new Object[] { "message", ExpressPaymentIntegrationNotAvailable.builder().message("message") },
                new Object[] { "payload", ExpressPaymentIntegrationNotAvailable.builder().payload("payload") },
                new Object[] { "correlationId",
                        ExpressPaymentIntegrationNotAvailable.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpressPaymentIntegrationNotAvailable value = ExpressPaymentIntegrationNotAvailable.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpressPaymentIntegrationNotAvailable value = ExpressPaymentIntegrationNotAvailable.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void payload() {
        ExpressPaymentIntegrationNotAvailable value = ExpressPaymentIntegrationNotAvailable.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }

    @Test
    public void correlationId() {
        ExpressPaymentIntegrationNotAvailable value = ExpressPaymentIntegrationNotAvailable.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
