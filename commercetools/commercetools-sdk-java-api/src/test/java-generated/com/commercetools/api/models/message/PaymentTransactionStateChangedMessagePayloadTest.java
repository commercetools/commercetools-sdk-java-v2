
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
public class PaymentTransactionStateChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentTransactionStateChangedMessagePayloadBuilder builder) {
        PaymentTransactionStateChangedMessagePayload paymentTransactionStateChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentTransactionStateChangedMessagePayload)
                .isInstanceOf(PaymentTransactionStateChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentTransactionStateChangedMessagePayload.builder().transactionId("transactionId") },
                new Object[] { PaymentTransactionStateChangedMessagePayload.builder()
                        .state(com.commercetools.api.models.payment.TransactionState.findEnum("Initial")) } };
    }

    @Test
    public void transactionId() {
        PaymentTransactionStateChangedMessagePayload value = PaymentTransactionStateChangedMessagePayload.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void state() {
        PaymentTransactionStateChangedMessagePayload value = PaymentTransactionStateChangedMessagePayload.of();
        value.setState(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
    }
}
