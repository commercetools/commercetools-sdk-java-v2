
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ErrorLoadingAllPaymentIntegrationsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ErrorLoadingAllPaymentIntegrationsBuilder builder) {
        ErrorLoadingAllPaymentIntegrations errorLoadingAllPaymentIntegrations = builder.buildUnchecked();
        Assertions.assertThat(errorLoadingAllPaymentIntegrations)
                .isInstanceOf(ErrorLoadingAllPaymentIntegrations.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", ErrorLoadingAllPaymentIntegrations.builder().severity("severity") },
                new Object[] { "message", ErrorLoadingAllPaymentIntegrations.builder().message("message") },
                new Object[] { "correlationId",
                        ErrorLoadingAllPaymentIntegrations.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ErrorLoadingAllPaymentIntegrations value = ErrorLoadingAllPaymentIntegrations.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ErrorLoadingAllPaymentIntegrations value = ErrorLoadingAllPaymentIntegrations.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ErrorLoadingAllPaymentIntegrations value = ErrorLoadingAllPaymentIntegrations.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
