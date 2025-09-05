
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartEmptiedDuringCheckoutTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartEmptiedDuringCheckoutBuilder builder) {
        CartEmptiedDuringCheckout cartEmptiedDuringCheckout = builder.buildUnchecked();
        Assertions.assertThat(cartEmptiedDuringCheckout).isInstanceOf(CartEmptiedDuringCheckout.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", CartEmptiedDuringCheckout.builder().severity("severity") },
                new Object[] { "message", CartEmptiedDuringCheckout.builder().message("message") },
                new Object[] { "correlationId", CartEmptiedDuringCheckout.builder().correlationId("correlationId") },
                new Object[] { "payload", CartEmptiedDuringCheckout.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        CartEmptiedDuringCheckout value = CartEmptiedDuringCheckout.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        CartEmptiedDuringCheckout value = CartEmptiedDuringCheckout.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        CartEmptiedDuringCheckout value = CartEmptiedDuringCheckout.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        CartEmptiedDuringCheckout value = CartEmptiedDuringCheckout.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
