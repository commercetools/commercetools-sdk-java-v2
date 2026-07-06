
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodSelectedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodSelectedBuilder builder) {
        ShippingMethodSelected shippingMethodSelected = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodSelected).isInstanceOf(ShippingMethodSelected.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ShippingMethodSelected.builder().severity("severity") },
                new Object[] { "message", ShippingMethodSelected.builder().message("message") },
                new Object[] { "correlationId", ShippingMethodSelected.builder().correlationId("correlationId") },
                new Object[] { "payload", ShippingMethodSelected.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        ShippingMethodSelected value = ShippingMethodSelected.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ShippingMethodSelected value = ShippingMethodSelected.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ShippingMethodSelected value = ShippingMethodSelected.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        ShippingMethodSelected value = ShippingMethodSelected.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
