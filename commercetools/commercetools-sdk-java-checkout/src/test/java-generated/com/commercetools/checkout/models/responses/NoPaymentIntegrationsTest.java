
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NoPaymentIntegrationsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NoPaymentIntegrationsBuilder builder) {
        NoPaymentIntegrations noPaymentIntegrations = builder.buildUnchecked();
        Assertions.assertThat(noPaymentIntegrations).isInstanceOf(NoPaymentIntegrations.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", NoPaymentIntegrations.builder().severity("severity") },
                new Object[] { "message", NoPaymentIntegrations.builder().message("message") },
                new Object[] { "correlationId", NoPaymentIntegrations.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        NoPaymentIntegrations value = NoPaymentIntegrations.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        NoPaymentIntegrations value = NoPaymentIntegrations.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        NoPaymentIntegrations value = NoPaymentIntegrations.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
