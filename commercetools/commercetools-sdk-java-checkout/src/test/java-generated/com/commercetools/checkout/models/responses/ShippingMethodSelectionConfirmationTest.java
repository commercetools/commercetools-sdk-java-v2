
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSelectionConfirmationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSelectionConfirmationBuilder builder) {
        ShippingMethodSelectionConfirmation shippingMethodSelectionConfirmation = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSelectionConfirmation)
                .isInstanceOf(ShippingMethodSelectionConfirmation.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", ShippingMethodSelectionConfirmation.builder().severity("severity") },
                new Object[] { "message", ShippingMethodSelectionConfirmation.builder().message("message") },
                new Object[] { "correlationId",
                        ShippingMethodSelectionConfirmation.builder().correlationId("correlationId") },
                new Object[] { "payload", ShippingMethodSelectionConfirmation.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        ShippingMethodSelectionConfirmation value = ShippingMethodSelectionConfirmation.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ShippingMethodSelectionConfirmation value = ShippingMethodSelectionConfirmation.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ShippingMethodSelectionConfirmation value = ShippingMethodSelectionConfirmation.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        ShippingMethodSelectionConfirmation value = ShippingMethodSelectionConfirmation.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
