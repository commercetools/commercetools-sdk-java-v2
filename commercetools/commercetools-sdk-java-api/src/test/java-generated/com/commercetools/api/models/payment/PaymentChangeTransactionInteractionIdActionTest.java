
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
public class PaymentChangeTransactionInteractionIdActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentChangeTransactionInteractionIdActionBuilder builder) {
        PaymentChangeTransactionInteractionIdAction paymentChangeTransactionInteractionIdAction = builder
                .buildUnchecked();
        Assertions.assertThat(paymentChangeTransactionInteractionIdAction)
                .isInstanceOf(PaymentChangeTransactionInteractionIdAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentChangeTransactionInteractionIdAction.builder().transactionId("transactionId") },
                new Object[] { PaymentChangeTransactionInteractionIdAction.builder().interactionId("interactionId") } };
    }

    @Test
    public void transactionId() {
        PaymentChangeTransactionInteractionIdAction value = PaymentChangeTransactionInteractionIdAction.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void interactionId() {
        PaymentChangeTransactionInteractionIdAction value = PaymentChangeTransactionInteractionIdAction.of();
        value.setInteractionId("interactionId");
        Assertions.assertThat(value.getInteractionId()).isEqualTo("interactionId");
    }
}
