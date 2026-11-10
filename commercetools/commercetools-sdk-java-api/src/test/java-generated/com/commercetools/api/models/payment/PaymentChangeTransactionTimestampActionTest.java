
package com.commercetools.api.models.payment;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentChangeTransactionTimestampActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentChangeTransactionTimestampActionBuilder builder) {
        PaymentChangeTransactionTimestampAction paymentChangeTransactionTimestampAction = builder.buildUnchecked();
        Assertions.assertThat(paymentChangeTransactionTimestampAction)
                .isInstanceOf(PaymentChangeTransactionTimestampAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentChangeTransactionTimestampAction.builder().transactionId("transactionId") },
                new Object[] { "timestamp", PaymentChangeTransactionTimestampAction.builder()
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
