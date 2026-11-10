
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCreatedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCreatedBuilder builder) {
        OrderCreated orderCreated = builder.buildUnchecked();
        Assertions.assertThat(orderCreated).isInstanceOf(OrderCreated.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", OrderCreated.builder().severity("severity") },
                new Object[] { "message", OrderCreated.builder().message("message") },
                new Object[] { "correlationId", OrderCreated.builder().correlationId("correlationId") },
                new Object[] { "payload", OrderCreated.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        OrderCreated value = OrderCreated.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        OrderCreated value = OrderCreated.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        OrderCreated value = OrderCreated.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        OrderCreated value = OrderCreated.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
