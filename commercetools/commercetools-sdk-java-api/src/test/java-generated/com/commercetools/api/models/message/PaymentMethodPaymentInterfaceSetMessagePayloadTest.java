
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodPaymentInterfaceSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodPaymentInterfaceSetMessagePayloadBuilder builder) {
        PaymentMethodPaymentInterfaceSetMessagePayload paymentMethodPaymentInterfaceSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodPaymentInterfaceSetMessagePayload)
                .isInstanceOf(PaymentMethodPaymentInterfaceSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentInterface",
                        PaymentMethodPaymentInterfaceSetMessagePayload.builder().paymentInterface("paymentInterface") },
                new Object[] { "oldPaymentInterface", PaymentMethodPaymentInterfaceSetMessagePayload.builder()
                        .oldPaymentInterface("oldPaymentInterface") } };
    }

    @Test
    public void paymentInterface() {
        PaymentMethodPaymentInterfaceSetMessagePayload value = PaymentMethodPaymentInterfaceSetMessagePayload.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }

    @Test
    public void oldPaymentInterface() {
        PaymentMethodPaymentInterfaceSetMessagePayload value = PaymentMethodPaymentInterfaceSetMessagePayload.of();
        value.setOldPaymentInterface("oldPaymentInterface");
        Assertions.assertThat(value.getOldPaymentInterface()).isEqualTo("oldPaymentInterface");
    }
}
