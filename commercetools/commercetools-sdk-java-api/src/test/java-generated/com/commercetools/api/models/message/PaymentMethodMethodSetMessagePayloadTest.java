
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodMethodSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodMethodSetMessagePayloadBuilder builder) {
        PaymentMethodMethodSetMessagePayload paymentMethodMethodSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodMethodSetMessagePayload)
                .isInstanceOf(PaymentMethodMethodSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "method", PaymentMethodMethodSetMessagePayload.builder().method("method") },
                new Object[] { "oldMethod", PaymentMethodMethodSetMessagePayload.builder().oldMethod("oldMethod") } };
    }

    @Test
    public void method() {
        PaymentMethodMethodSetMessagePayload value = PaymentMethodMethodSetMessagePayload.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void oldMethod() {
        PaymentMethodMethodSetMessagePayload value = PaymentMethodMethodSetMessagePayload.of();
        value.setOldMethod("oldMethod");
        Assertions.assertThat(value.getOldMethod()).isEqualTo("oldMethod");
    }
}
