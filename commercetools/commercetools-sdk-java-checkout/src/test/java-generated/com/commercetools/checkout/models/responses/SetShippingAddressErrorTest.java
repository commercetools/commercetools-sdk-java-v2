
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingAddressErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingAddressErrorBuilder builder) {
        SetShippingAddressError setShippingAddressError = builder.buildUnchecked();
        Assertions.assertThat(setShippingAddressError).isInstanceOf(SetShippingAddressError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", SetShippingAddressError.builder().severity("severity") },
                new Object[] { "message", SetShippingAddressError.builder().message("message") },
                new Object[] { "correlationId", SetShippingAddressError.builder().correlationId("correlationId") },
                new Object[] { "payload", SetShippingAddressError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        SetShippingAddressError value = SetShippingAddressError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        SetShippingAddressError value = SetShippingAddressError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        SetShippingAddressError value = SetShippingAddressError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        SetShippingAddressError value = SetShippingAddressError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
