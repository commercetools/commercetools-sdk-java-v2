
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutStartedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutStartedBuilder builder) {
        CheckoutStarted checkoutStarted = builder.buildUnchecked();
        Assertions.assertThat(checkoutStarted).isInstanceOf(CheckoutStarted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", CheckoutStarted.builder().severity("severity") },
                new Object[] { "message", CheckoutStarted.builder().message("message") },
                new Object[] { "correlationId", CheckoutStarted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        CheckoutStarted value = CheckoutStarted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        CheckoutStarted value = CheckoutStarted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        CheckoutStarted value = CheckoutStarted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
