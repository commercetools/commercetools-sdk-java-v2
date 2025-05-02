
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetTransactionCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetTransactionCustomFieldActionBuilder builder) {
        PaymentSetTransactionCustomFieldAction paymentSetTransactionCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetTransactionCustomFieldAction)
                .isInstanceOf(PaymentSetTransactionCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentSetTransactionCustomFieldAction.builder().transactionId("transactionId") },
                new Object[] { "name", PaymentSetTransactionCustomFieldAction.builder().name("name") },
                new Object[] { "value", PaymentSetTransactionCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void transactionId() {
        PaymentSetTransactionCustomFieldAction value = PaymentSetTransactionCustomFieldAction.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void name() {
        PaymentSetTransactionCustomFieldAction value = PaymentSetTransactionCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentSetTransactionCustomFieldAction value = PaymentSetTransactionCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
