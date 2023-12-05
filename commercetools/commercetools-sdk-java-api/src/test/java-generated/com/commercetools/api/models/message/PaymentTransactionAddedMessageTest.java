
package com.commercetools.api.models.message;

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
public class PaymentTransactionAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentTransactionAddedMessageBuilder builder) {
        PaymentTransactionAddedMessage paymentTransactionAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentTransactionAddedMessage).isInstanceOf(PaymentTransactionAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { PaymentTransactionAddedMessage.builder()
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
