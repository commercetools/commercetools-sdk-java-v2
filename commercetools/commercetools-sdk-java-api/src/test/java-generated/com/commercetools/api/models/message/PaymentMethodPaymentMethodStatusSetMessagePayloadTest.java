
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodPaymentMethodStatusSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder builder) {
        PaymentMethodPaymentMethodStatusSetMessagePayload paymentMethodPaymentMethodStatusSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodPaymentMethodStatusSetMessagePayload)
                .isInstanceOf(PaymentMethodPaymentMethodStatusSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "status",
                        PaymentMethodPaymentMethodStatusSetMessagePayload.builder()
                                .status(com.commercetools.api.models.payment_method.PaymentMethodStatus
                                        .findEnum("Active")) },
                new Object[] { "oldStatus", PaymentMethodPaymentMethodStatusSetMessagePayload.builder()
                        .oldStatus(
                            com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active")) } };
    }

    @Test
    public void status() {
        PaymentMethodPaymentMethodStatusSetMessagePayload value = PaymentMethodPaymentMethodStatusSetMessagePayload
                .of();
        value.setStatus(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
    }

    @Test
    public void oldStatus() {
        PaymentMethodPaymentMethodStatusSetMessagePayload value = PaymentMethodPaymentMethodStatusSetMessagePayload
                .of();
        value.setOldStatus(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
        Assertions.assertThat(value.getOldStatus())
                .isEqualTo(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
    }
}
