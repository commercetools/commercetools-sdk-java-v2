
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetTransactionCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetTransactionCustomTypeActionBuilder builder) {
        PaymentSetTransactionCustomTypeAction paymentSetTransactionCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetTransactionCustomTypeAction)
                .isInstanceOf(PaymentSetTransactionCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "transactionId",
                        PaymentSetTransactionCustomTypeAction.builder().transactionId("transactionId") },
                new Object[] { "type",
                        PaymentSetTransactionCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", PaymentSetTransactionCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void transactionId() {
        PaymentSetTransactionCustomTypeAction value = PaymentSetTransactionCustomTypeAction.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void type() {
        PaymentSetTransactionCustomTypeAction value = PaymentSetTransactionCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        PaymentSetTransactionCustomTypeAction value = PaymentSetTransactionCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
