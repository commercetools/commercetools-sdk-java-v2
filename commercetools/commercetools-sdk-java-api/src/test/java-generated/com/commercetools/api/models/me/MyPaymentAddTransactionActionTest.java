
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentAddTransactionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentAddTransactionActionBuilder builder) {
        MyPaymentAddTransactionAction myPaymentAddTransactionAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentAddTransactionAction).isInstanceOf(MyPaymentAddTransactionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "transaction", MyPaymentAddTransactionAction.builder()
                .transaction(new com.commercetools.api.models.payment.TransactionDraftImpl()) } };
    }

    @Test
    public void transaction() {
        MyPaymentAddTransactionAction value = MyPaymentAddTransactionAction.of();
        value.setTransaction(new com.commercetools.api.models.payment.TransactionDraftImpl());
        Assertions.assertThat(value.getTransaction())
                .isEqualTo(new com.commercetools.api.models.payment.TransactionDraftImpl());
    }
}
