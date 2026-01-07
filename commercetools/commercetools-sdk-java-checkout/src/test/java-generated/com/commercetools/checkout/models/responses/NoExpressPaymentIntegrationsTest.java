
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NoExpressPaymentIntegrationsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NoExpressPaymentIntegrationsBuilder builder) {
        NoExpressPaymentIntegrations noExpressPaymentIntegrations = builder.buildUnchecked();
        Assertions.assertThat(noExpressPaymentIntegrations).isInstanceOf(NoExpressPaymentIntegrations.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", NoExpressPaymentIntegrations.builder().severity("severity") },
                new Object[] { "message", NoExpressPaymentIntegrations.builder().message("message") }, new Object[] {
                        "correlationId", NoExpressPaymentIntegrations.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        NoExpressPaymentIntegrations value = NoExpressPaymentIntegrations.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        NoExpressPaymentIntegrations value = NoExpressPaymentIntegrations.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        NoExpressPaymentIntegrations value = NoExpressPaymentIntegrations.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
