
package com.commercetools.api.models.me;

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
public class MyPaymentAddTransactionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentAddTransactionActionBuilder builder) {
        MyPaymentAddTransactionAction myPaymentAddTransactionAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentAddTransactionAction).isInstanceOf(MyPaymentAddTransactionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyPaymentAddTransactionAction.builder()
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
