
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartNotFoundTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartNotFoundBuilder builder) {
        CartNotFound cartNotFound = builder.buildUnchecked();
        Assertions.assertThat(cartNotFound).isInstanceOf(CartNotFound.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", CartNotFound.builder().severity("severity") },
                new Object[] { "message", CartNotFound.builder().message("message") },
                new Object[] { "correlationId", CartNotFound.builder().correlationId("correlationId") },
                new Object[] { "payload", CartNotFound.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        CartNotFound value = CartNotFound.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        CartNotFound value = CartNotFound.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        CartNotFound value = CartNotFound.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        CartNotFound value = CartNotFound.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
