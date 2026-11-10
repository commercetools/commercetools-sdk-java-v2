
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetMethodInfoCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetMethodInfoCustomTypeActionBuilder builder) {
        PaymentSetMethodInfoCustomTypeAction paymentSetMethodInfoCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetMethodInfoCustomTypeAction)
                .isInstanceOf(PaymentSetMethodInfoCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "type",
                        PaymentSetMethodInfoCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", PaymentSetMethodInfoCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void type() {
        PaymentSetMethodInfoCustomTypeAction value = PaymentSetMethodInfoCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        PaymentSetMethodInfoCustomTypeAction value = PaymentSetMethodInfoCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
