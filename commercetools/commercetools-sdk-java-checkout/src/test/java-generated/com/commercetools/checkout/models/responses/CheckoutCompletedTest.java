
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutCompletedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutCompletedBuilder builder) {
        CheckoutCompleted checkoutCompleted = builder.buildUnchecked();
        Assertions.assertThat(checkoutCompleted).isInstanceOf(CheckoutCompleted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", CheckoutCompleted.builder().severity("severity") },
                new Object[] { "message", CheckoutCompleted.builder().message("message") },
                new Object[] { "payload", CheckoutCompleted.builder().payload("payload") },
                new Object[] { "correlationId", CheckoutCompleted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        CheckoutCompleted value = CheckoutCompleted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        CheckoutCompleted value = CheckoutCompleted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void payload() {
        CheckoutCompleted value = CheckoutCompleted.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }

    @Test
    public void correlationId() {
        CheckoutCompleted value = CheckoutCompleted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
