
package com.commercetools.api.models.payment;

import java.time.ZonedDateTime;

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
public class PaymentChangeTransactionTimestampActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentChangeTransactionTimestampActionBuilder builder) {
        PaymentChangeTransactionTimestampAction paymentChangeTransactionTimestampAction = builder.buildUnchecked();
        Assertions.assertThat(paymentChangeTransactionTimestampAction)
                .isInstanceOf(PaymentChangeTransactionTimestampAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentChangeTransactionTimestampAction.builder().transactionId("transactionId") },
                new Object[] { PaymentChangeTransactionTimestampAction.builder()
                        .timestamp(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void transactionId() {
        PaymentChangeTransactionTimestampAction value = PaymentChangeTransactionTimestampAction.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void timestamp() {
        PaymentChangeTransactionTimestampAction value = PaymentChangeTransactionTimestampAction.of();
        value.setTimestamp(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTimestamp()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
