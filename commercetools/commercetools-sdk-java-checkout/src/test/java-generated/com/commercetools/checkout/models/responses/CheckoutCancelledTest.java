
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutCancelledTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutCancelledBuilder builder) {
        CheckoutCancelled checkoutCancelled = builder.buildUnchecked();
        Assertions.assertThat(checkoutCancelled).isInstanceOf(CheckoutCancelled.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", CheckoutCancelled.builder().severity("severity") },
                new Object[] { "message", CheckoutCancelled.builder().message("message") },
                new Object[] { "correlationId", CheckoutCancelled.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        CheckoutCancelled value = CheckoutCancelled.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        CheckoutCancelled value = CheckoutCancelled.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        CheckoutCancelled value = CheckoutCancelled.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
