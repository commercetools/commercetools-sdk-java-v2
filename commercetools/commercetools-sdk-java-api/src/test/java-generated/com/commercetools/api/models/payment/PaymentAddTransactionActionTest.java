
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentAddTransactionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentAddTransactionActionBuilder builder) {
        PaymentAddTransactionAction paymentAddTransactionAction = builder.buildUnchecked();
        Assertions.assertThat(paymentAddTransactionAction).isInstanceOf(PaymentAddTransactionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "transaction", PaymentAddTransactionAction.builder()
                .transaction(new com.commercetools.api.models.payment.TransactionDraftImpl()) } };
    }

    @Test
    public void transaction() {
        PaymentAddTransactionAction value = PaymentAddTransactionAction.of();
        value.setTransaction(new com.commercetools.api.models.payment.TransactionDraftImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.api.models.payment.TransactionDraftImpl());
    }
}
