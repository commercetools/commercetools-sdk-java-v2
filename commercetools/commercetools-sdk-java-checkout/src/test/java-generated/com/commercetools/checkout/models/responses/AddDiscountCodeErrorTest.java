
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddDiscountCodeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddDiscountCodeErrorBuilder builder) {
        AddDiscountCodeError addDiscountCodeError = builder.buildUnchecked();
        Assertions.assertThat(addDiscountCodeError).isInstanceOf(AddDiscountCodeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", AddDiscountCodeError.builder().severity("severity") },
                new Object[] { "message", AddDiscountCodeError.builder().message("message") },
                new Object[] { "correlationId", AddDiscountCodeError.builder().correlationId("correlationId") },
                new Object[] { "payload", AddDiscountCodeError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        AddDiscountCodeError value = AddDiscountCodeError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        AddDiscountCodeError value = AddDiscountCodeError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        AddDiscountCodeError value = AddDiscountCodeError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        AddDiscountCodeError value = AddDiscountCodeError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
