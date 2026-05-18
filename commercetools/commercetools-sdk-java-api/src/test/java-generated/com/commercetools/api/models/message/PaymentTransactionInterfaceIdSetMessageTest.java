
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentTransactionInterfaceIdSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentTransactionInterfaceIdSetMessageBuilder builder) {
        PaymentTransactionInterfaceIdSetMessage paymentTransactionInterfaceIdSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentTransactionInterfaceIdSetMessage)
                .isInstanceOf(PaymentTransactionInterfaceIdSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentTransactionInterfaceIdSetMessage.builder().transactionId("transactionId") },
                new Object[] { "newInterfaceId",
                        PaymentTransactionInterfaceIdSetMessage.builder().newInterfaceId("newInterfaceId") },
                new Object[] { "oldInterfaceId",
                        PaymentTransactionInterfaceIdSetMessage.builder().oldInterfaceId("oldInterfaceId") } };
    }

    @Test
    public void transactionId() {
        PaymentTransactionInterfaceIdSetMessage value = PaymentTransactionInterfaceIdSetMessage.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void newInterfaceId() {
        PaymentTransactionInterfaceIdSetMessage value = PaymentTransactionInterfaceIdSetMessage.of();
        value.setNewInterfaceId("newInterfaceId");
        Assertions.assertThat(value.getNewInterfaceId()).isEqualTo("newInterfaceId");
    }

    @Test
    public void oldInterfaceId() {
        PaymentTransactionInterfaceIdSetMessage value = PaymentTransactionInterfaceIdSetMessage.of();
        value.setOldInterfaceId("oldInterfaceId");
        Assertions.assertThat(value.getOldInterfaceId()).isEqualTo("oldInterfaceId");
    }
}
