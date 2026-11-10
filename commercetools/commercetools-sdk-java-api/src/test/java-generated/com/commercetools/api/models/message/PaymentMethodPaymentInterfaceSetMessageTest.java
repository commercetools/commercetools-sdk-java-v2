
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodPaymentInterfaceSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodPaymentInterfaceSetMessageBuilder builder) {
        PaymentMethodPaymentInterfaceSetMessage paymentMethodPaymentInterfaceSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodPaymentInterfaceSetMessage)
                .isInstanceOf(PaymentMethodPaymentInterfaceSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentInterface",
                        PaymentMethodPaymentInterfaceSetMessage.builder().paymentInterface("paymentInterface") },
                new Object[] { "oldPaymentInterface", PaymentMethodPaymentInterfaceSetMessage.builder()
                        .oldPaymentInterface("oldPaymentInterface") } };
    }

    @Test
    public void paymentInterface() {
        PaymentMethodPaymentInterfaceSetMessage value = PaymentMethodPaymentInterfaceSetMessage.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }

    @Test
    public void oldPaymentInterface() {
        PaymentMethodPaymentInterfaceSetMessage value = PaymentMethodPaymentInterfaceSetMessage.of();
        value.setOldPaymentInterface("oldPaymentInterface");
        Assertions.assertThat(value.getOldPaymentInterface()).isEqualTo("oldPaymentInterface");
    }
}
