
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingAddressMissingErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingAddressMissingErrorBuilder builder) {
        ShippingAddressMissingError shippingAddressMissingError = builder.buildUnchecked();
        Assertions.assertThat(shippingAddressMissingError).isInstanceOf(ShippingAddressMissingError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ShippingAddressMissingError.builder().severity("severity") },
                new Object[] { "message", ShippingAddressMissingError.builder().message("message") },
                new Object[] { "correlationId", ShippingAddressMissingError.builder().correlationId("correlationId") },
                new Object[] { "payload", ShippingAddressMissingError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        ShippingAddressMissingError value = ShippingAddressMissingError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ShippingAddressMissingError value = ShippingAddressMissingError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ShippingAddressMissingError value = ShippingAddressMissingError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        ShippingAddressMissingError value = ShippingAddressMissingError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
