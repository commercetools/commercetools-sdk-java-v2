
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentChangeTransactionInteractionIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentChangeTransactionInteractionIdActionBuilder builder) {
        PaymentChangeTransactionInteractionIdAction paymentChangeTransactionInteractionIdAction = builder
                .buildUnchecked();
        Assertions.assertThat(paymentChangeTransactionInteractionIdAction)
                .isInstanceOf(PaymentChangeTransactionInteractionIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentChangeTransactionInteractionIdAction.builder().transactionId("transactionId") },
                new Object[] { "interactionId",
                        PaymentChangeTransactionInteractionIdAction.builder().interactionId("interactionId") } };
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
