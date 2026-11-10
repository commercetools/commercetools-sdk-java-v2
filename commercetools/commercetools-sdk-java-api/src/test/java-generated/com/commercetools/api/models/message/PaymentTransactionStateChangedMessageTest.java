
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentTransactionStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentTransactionStateChangedMessageBuilder builder) {
        PaymentTransactionStateChangedMessage paymentTransactionStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentTransactionStateChangedMessage)
                .isInstanceOf(PaymentTransactionStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentTransactionStateChangedMessage.builder().transactionId("transactionId") },
                new Object[] { "state", PaymentTransactionStateChangedMessage.builder()
                        .state(com.commercetools.api.models.payment.TransactionState.findEnum("Initial")) } };
    }

    @Test
    public void transactionId() {
        PaymentTransactionStateChangedMessage value = PaymentTransactionStateChangedMessage.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void state() {
        PaymentTransactionStateChangedMessage value = PaymentTransactionStateChangedMessage.of();
        value.setState(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
    }
}
