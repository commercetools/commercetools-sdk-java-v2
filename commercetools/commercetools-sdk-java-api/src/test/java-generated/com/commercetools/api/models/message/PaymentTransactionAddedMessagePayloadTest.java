
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentTransactionAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentTransactionAddedMessagePayloadBuilder builder) {
        PaymentTransactionAddedMessagePayload paymentTransactionAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(paymentTransactionAddedMessagePayload)
                .isInstanceOf(PaymentTransactionAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "transaction", PaymentTransactionAddedMessagePayload.builder()
                .transaction(new com.commercetools.api.models.payment.TransactionImpl()) } };
    }

    @Test
    public void transaction() {
        PaymentTransactionAddedMessagePayload value = PaymentTransactionAddedMessagePayload.of();
        value.setTransaction(new com.commercetools.api.models.payment.TransactionImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.api.models.payment.TransactionImpl());
    }
}
