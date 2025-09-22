
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentTransactionInterfaceIdSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentTransactionInterfaceIdSetMessagePayloadBuilder builder) {
        PaymentTransactionInterfaceIdSetMessagePayload paymentTransactionInterfaceIdSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(paymentTransactionInterfaceIdSetMessagePayload)
                .isInstanceOf(PaymentTransactionInterfaceIdSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentTransactionInterfaceIdSetMessagePayload.builder().transactionId("transactionId") },
                new Object[] { "newInterfaceId",
                        PaymentTransactionInterfaceIdSetMessagePayload.builder().newInterfaceId("newInterfaceId") },
                new Object[] { "oldInterfaceId",
                        PaymentTransactionInterfaceIdSetMessagePayload.builder().oldInterfaceId("oldInterfaceId") } };
    }

    @Test
    public void transactionId() {
        PaymentTransactionInterfaceIdSetMessagePayload value = PaymentTransactionInterfaceIdSetMessagePayload.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void newInterfaceId() {
        PaymentTransactionInterfaceIdSetMessagePayload value = PaymentTransactionInterfaceIdSetMessagePayload.of();
        value.setNewInterfaceId("newInterfaceId");
        Assertions.assertThat(value.getNewInterfaceId()).isEqualTo("newInterfaceId");
    }

    @Test
    public void oldInterfaceId() {
        PaymentTransactionInterfaceIdSetMessagePayload value = PaymentTransactionInterfaceIdSetMessagePayload.of();
        value.setOldInterfaceId("oldInterfaceId");
        Assertions.assertThat(value.getOldInterfaceId()).isEqualTo("oldInterfaceId");
    }
}
