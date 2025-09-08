
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveDiscountCodeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveDiscountCodeErrorBuilder builder) {
        RemoveDiscountCodeError removeDiscountCodeError = builder.buildUnchecked();
        Assertions.assertThat(removeDiscountCodeError).isInstanceOf(RemoveDiscountCodeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", RemoveDiscountCodeError.builder().severity("severity") },
                new Object[] { "message", RemoveDiscountCodeError.builder().message("message") },
                new Object[] { "correlationId", RemoveDiscountCodeError.builder().correlationId("correlationId") },
                new Object[] { "payload", RemoveDiscountCodeError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        RemoveDiscountCodeError value = RemoveDiscountCodeError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        RemoveDiscountCodeError value = RemoveDiscountCodeError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        RemoveDiscountCodeError value = RemoveDiscountCodeError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        RemoveDiscountCodeError value = RemoveDiscountCodeError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
