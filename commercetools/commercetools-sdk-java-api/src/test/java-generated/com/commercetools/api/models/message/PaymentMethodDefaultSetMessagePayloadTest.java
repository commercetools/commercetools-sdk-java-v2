
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodDefaultSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodDefaultSetMessagePayloadBuilder builder) {
        PaymentMethodDefaultSetMessagePayload paymentMethodDefaultSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodDefaultSetMessagePayload)
                .isInstanceOf(PaymentMethodDefaultSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "default", PaymentMethodDefaultSetMessagePayload.builder()._default(true) },
                new Object[] { "oldDefault", PaymentMethodDefaultSetMessagePayload.builder().oldDefault(true) } };
    }

    @Test
    public void _default() {
        PaymentMethodDefaultSetMessagePayload value = PaymentMethodDefaultSetMessagePayload.of();
        value.setDefault(true);
        Assertions.assertThat(value.getDefault()).isEqualTo(true);
    }

    @Test
    public void oldDefault() {
        PaymentMethodDefaultSetMessagePayload value = PaymentMethodDefaultSetMessagePayload.of();
        value.setOldDefault(true);
        Assertions.assertThat(value.getOldDefault()).isEqualTo(true);
    }
}
