
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetTransactionInterfaceIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetTransactionInterfaceIdActionBuilder builder) {
        PaymentSetTransactionInterfaceIdAction paymentSetTransactionInterfaceIdAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetTransactionInterfaceIdAction)
                .isInstanceOf(PaymentSetTransactionInterfaceIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentSetTransactionInterfaceIdAction.builder().transactionId("transactionId") },
                new Object[] { "interfaceId",
                        PaymentSetTransactionInterfaceIdAction.builder().interfaceId("interfaceId") } };
    }

    @Test
    public void transactionId() {
        PaymentSetTransactionInterfaceIdAction value = PaymentSetTransactionInterfaceIdAction.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void interfaceId() {
        PaymentSetTransactionInterfaceIdAction value = PaymentSetTransactionInterfaceIdAction.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }
}
