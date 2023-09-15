
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
public class PaymentChangeTransactionStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentChangeTransactionStateActionBuilder builder) {
        PaymentChangeTransactionStateAction paymentChangeTransactionStateAction = builder.buildUnchecked();
        Assertions.assertThat(paymentChangeTransactionStateAction)
                .isInstanceOf(PaymentChangeTransactionStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentChangeTransactionStateAction.builder().transactionId("transactionId") },
                new Object[] { PaymentChangeTransactionStateAction.builder()
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
