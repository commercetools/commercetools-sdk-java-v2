
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
public class PaymentTransactionStateChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentTransactionStateChangedMessageBuilder builder) {
        PaymentTransactionStateChangedMessage paymentTransactionStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentTransactionStateChangedMessage)
                .isInstanceOf(PaymentTransactionStateChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentTransactionStateChangedMessage.builder().transactionId("transactionId") },
                new Object[] { PaymentTransactionStateChangedMessage.builder()
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
