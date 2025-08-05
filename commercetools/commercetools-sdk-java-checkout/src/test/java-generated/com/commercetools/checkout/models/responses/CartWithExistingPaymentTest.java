
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartWithExistingPaymentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartWithExistingPaymentBuilder builder) {
        CartWithExistingPayment cartWithExistingPayment = builder.buildUnchecked();
        Assertions.assertThat(cartWithExistingPayment).isInstanceOf(CartWithExistingPayment.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", CartWithExistingPayment.builder().severity("severity") },
                new Object[] { "message", CartWithExistingPayment.builder().message("message") },
                new Object[] { "correlationId", CartWithExistingPayment.builder().correlationId("correlationId") },
                new Object[] { "payload", CartWithExistingPayment.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        CartWithExistingPayment value = CartWithExistingPayment.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        CartWithExistingPayment value = CartWithExistingPayment.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        CartWithExistingPayment value = CartWithExistingPayment.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        CartWithExistingPayment value = CartWithExistingPayment.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
