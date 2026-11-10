
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodPaymentMethodStatusSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodPaymentMethodStatusSetMessageBuilder builder) {
        PaymentMethodPaymentMethodStatusSetMessage paymentMethodPaymentMethodStatusSetMessage = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodPaymentMethodStatusSetMessage)
                .isInstanceOf(PaymentMethodPaymentMethodStatusSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "status",
                        PaymentMethodPaymentMethodStatusSetMessage.builder()
                                .status(com.commercetools.api.models.payment_method.PaymentMethodStatus
                                        .findEnum("Active")) },
                new Object[] { "oldStatus", PaymentMethodPaymentMethodStatusSetMessage.builder()
                        .oldStatus(
                            com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active")) } };
    }

    @Test
    public void status() {
        PaymentMethodPaymentMethodStatusSetMessage value = PaymentMethodPaymentMethodStatusSetMessage.of();
        value.setStatus(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
    }

    @Test
    public void oldStatus() {
        PaymentMethodPaymentMethodStatusSetMessage value = PaymentMethodPaymentMethodStatusSetMessage.of();
        value.setOldStatus(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
        Assertions.assertThat(value.getOldStatus())
                .isEqualTo(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
    }
}
