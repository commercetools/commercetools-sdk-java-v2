
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpressPaymentInterruptedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpressPaymentInterruptedBuilder builder) {
        ExpressPaymentInterrupted expressPaymentInterrupted = builder.buildUnchecked();
        Assertions.assertThat(expressPaymentInterrupted).isInstanceOf(ExpressPaymentInterrupted.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ExpressPaymentInterrupted.builder().severity("severity") },
                new Object[] { "message", ExpressPaymentInterrupted.builder().message("message") },
                new Object[] { "correlationId", ExpressPaymentInterrupted.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpressPaymentInterrupted value = ExpressPaymentInterrupted.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpressPaymentInterrupted value = ExpressPaymentInterrupted.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ExpressPaymentInterrupted value = ExpressPaymentInterrupted.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
