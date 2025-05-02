
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentTransactionStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentTransactionStateChangedMessagePayloadBuilder builder) {
        PaymentTransactionStateChangedMessagePayload paymentTransactionStateChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentTransactionStateChangedMessagePayload)
                .isInstanceOf(PaymentTransactionStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentTransactionStateChangedMessagePayload.builder().transactionId("transactionId") },
                new Object[] { "state", PaymentTransactionStateChangedMessagePayload.builder()
                        .state(com.commercetools.api.models.payment.TransactionState.findEnum("Initial")) } };
    }

    @Test
    public void transactionId() {
        PaymentTransactionStateChangedMessagePayload value = PaymentTransactionStateChangedMessagePayload.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void state() {
        PaymentTransactionStateChangedMessagePayload value = PaymentTransactionStateChangedMessagePayload.of();
        value.setState(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
    }
}
