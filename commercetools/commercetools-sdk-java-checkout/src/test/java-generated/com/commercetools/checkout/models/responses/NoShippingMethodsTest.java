
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class NoShippingMethodsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, NoShippingMethodsBuilder builder) {
        NoShippingMethods noShippingMethods = builder.buildUnchecked();
        Assertions.assertThat(noShippingMethods).isInstanceOf(NoShippingMethods.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", NoShippingMethods.builder().severity("severity") },
                new Object[] { "message", NoShippingMethods.builder().message("message") },
                new Object[] { "correlationId", NoShippingMethods.builder().correlationId("correlationId") },
                new Object[] { "payload", NoShippingMethods.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        NoShippingMethods value = NoShippingMethods.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        NoShippingMethods value = NoShippingMethods.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        NoShippingMethods value = NoShippingMethods.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        NoShippingMethods value = NoShippingMethods.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
