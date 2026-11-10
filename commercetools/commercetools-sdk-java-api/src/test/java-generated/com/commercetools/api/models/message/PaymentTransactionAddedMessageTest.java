
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentTransactionAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentTransactionAddedMessageBuilder builder) {
        PaymentTransactionAddedMessage paymentTransactionAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentTransactionAddedMessage).isInstanceOf(PaymentTransactionAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "transaction", PaymentTransactionAddedMessage.builder()
                .transaction(new com.commercetools.api.models.payment.TransactionImpl()) } };
    }

    @Test
    public void transaction() {
        PaymentTransactionAddedMessage value = PaymentTransactionAddedMessage.of();
        value.setTransaction(new com.commercetools.api.models.payment.TransactionImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.api.models.payment.TransactionImpl());
    }
}
