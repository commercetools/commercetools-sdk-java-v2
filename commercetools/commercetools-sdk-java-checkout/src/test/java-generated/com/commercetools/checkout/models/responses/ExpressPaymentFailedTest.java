
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpressPaymentFailedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpressPaymentFailedBuilder builder) {
        ExpressPaymentFailed expressPaymentFailed = builder.buildUnchecked();
        Assertions.assertThat(expressPaymentFailed).isInstanceOf(ExpressPaymentFailed.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ExpressPaymentFailed.builder().severity("severity") },
                new Object[] { "message", ExpressPaymentFailed.builder().message("message") },
                new Object[] { "payload", ExpressPaymentFailed.builder().payload("payload") },
                new Object[] { "correlationId", ExpressPaymentFailed.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpressPaymentFailed value = ExpressPaymentFailed.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpressPaymentFailed value = ExpressPaymentFailed.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void payload() {
        ExpressPaymentFailed value = ExpressPaymentFailed.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }

    @Test
    public void correlationId() {
        ExpressPaymentFailed value = ExpressPaymentFailed.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
