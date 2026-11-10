
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartEmptyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartEmptyBuilder builder) {
        CartEmpty cartEmpty = builder.buildUnchecked();
        Assertions.assertThat(cartEmpty).isInstanceOf(CartEmpty.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", CartEmpty.builder().severity("severity") },
                new Object[] { "message", CartEmpty.builder().message("message") },
                new Object[] { "correlationId", CartEmpty.builder().correlationId("correlationId") },
                new Object[] { "payload", CartEmpty.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        CartEmpty value = CartEmpty.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        CartEmpty value = CartEmpty.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        CartEmpty value = CartEmpty.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        CartEmpty value = CartEmpty.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
