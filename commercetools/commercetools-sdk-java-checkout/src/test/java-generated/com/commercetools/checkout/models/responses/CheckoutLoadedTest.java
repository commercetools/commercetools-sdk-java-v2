
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CheckoutLoadedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CheckoutLoadedBuilder builder) {
        CheckoutLoaded checkoutLoaded = builder.buildUnchecked();
        Assertions.assertThat(checkoutLoaded).isInstanceOf(CheckoutLoaded.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", CheckoutLoaded.builder().severity("severity") },
                new Object[] { "message", CheckoutLoaded.builder().message("message") },
                new Object[] { "correlationId", CheckoutLoaded.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        CheckoutLoaded value = CheckoutLoaded.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        CheckoutLoaded value = CheckoutLoaded.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        CheckoutLoaded value = CheckoutLoaded.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
