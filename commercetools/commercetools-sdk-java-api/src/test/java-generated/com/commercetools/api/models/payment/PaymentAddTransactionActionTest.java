
package com.commercetools.api.models.payment;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class PaymentAddTransactionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentAddTransactionActionBuilder builder) {
        PaymentAddTransactionAction paymentAddTransactionAction = builder.buildUnchecked();
        Assertions.assertThat(paymentAddTransactionAction).isInstanceOf(PaymentAddTransactionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentAddTransactionAction.builder()
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
