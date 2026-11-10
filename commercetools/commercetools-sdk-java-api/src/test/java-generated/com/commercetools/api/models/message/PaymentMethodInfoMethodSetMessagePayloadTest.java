
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoMethodSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoMethodSetMessagePayloadBuilder builder) {
        PaymentMethodInfoMethodSetMessagePayload paymentMethodInfoMethodSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoMethodSetMessagePayload)
                .isInstanceOf(PaymentMethodInfoMethodSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "method", PaymentMethodInfoMethodSetMessagePayload.builder().method("method") },
                new Object[] { "oldMethod",
                        PaymentMethodInfoMethodSetMessagePayload.builder().oldMethod("oldMethod") } };
    }

    @Test
    public void method() {
        PaymentMethodInfoMethodSetMessagePayload value = PaymentMethodInfoMethodSetMessagePayload.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void oldMethod() {
        PaymentMethodInfoMethodSetMessagePayload value = PaymentMethodInfoMethodSetMessagePayload.of();
        value.setOldMethod("oldMethod");
        Assertions.assertThat(value.getOldMethod()).isEqualTo("oldMethod");
    }
}
