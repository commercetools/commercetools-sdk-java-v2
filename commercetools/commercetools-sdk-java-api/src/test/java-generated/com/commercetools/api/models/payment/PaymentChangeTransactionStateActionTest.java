
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentChangeTransactionStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentChangeTransactionStateActionBuilder builder) {
        PaymentChangeTransactionStateAction paymentChangeTransactionStateAction = builder.buildUnchecked();
        Assertions.assertThat(paymentChangeTransactionStateAction)
                .isInstanceOf(PaymentChangeTransactionStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentChangeTransactionStateAction.builder().transactionId("transactionId") },
                new Object[] { "state", PaymentChangeTransactionStateAction.builder()
                        .state(com.commercetools.api.models.payment.TransactionState.findEnum("Initial")) } };
    }

    @Test
    public void transactionId() {
        PaymentChangeTransactionStateAction value = PaymentChangeTransactionStateAction.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void state() {
        PaymentChangeTransactionStateAction value = PaymentChangeTransactionStateAction.of();
        value.setState(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
    }
}
