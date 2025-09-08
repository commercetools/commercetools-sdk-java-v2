
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ShippingMethodDoesNotMatchCartTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ShippingMethodDoesNotMatchCartBuilder builder) {
        ShippingMethodDoesNotMatchCart shippingMethodDoesNotMatchCart = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodDoesNotMatchCart).isInstanceOf(ShippingMethodDoesNotMatchCart.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", ShippingMethodDoesNotMatchCart.builder().severity("severity") },
                new Object[] { "message", ShippingMethodDoesNotMatchCart.builder().message("message") }, new Object[] {
                        "correlationId", ShippingMethodDoesNotMatchCart.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ShippingMethodDoesNotMatchCart value = ShippingMethodDoesNotMatchCart.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ShippingMethodDoesNotMatchCart value = ShippingMethodDoesNotMatchCart.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ShippingMethodDoesNotMatchCart value = ShippingMethodDoesNotMatchCart.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
