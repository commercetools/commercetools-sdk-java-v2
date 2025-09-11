
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCreationErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCreationErrorBuilder builder) {
        OrderCreationError orderCreationError = builder.buildUnchecked();
        Assertions.assertThat(orderCreationError).isInstanceOf(OrderCreationError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", OrderCreationError.builder().severity("severity") },
                new Object[] { "message", OrderCreationError.builder().message("message") },
                new Object[] { "correlationId", OrderCreationError.builder().correlationId("correlationId") },
                new Object[] { "payload", OrderCreationError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        OrderCreationError value = OrderCreationError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        OrderCreationError value = OrderCreationError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        OrderCreationError value = OrderCreationError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        OrderCreationError value = OrderCreationError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
