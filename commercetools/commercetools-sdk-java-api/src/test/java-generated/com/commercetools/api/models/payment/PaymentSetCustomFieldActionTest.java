
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetCustomFieldActionBuilder builder) {
        PaymentSetCustomFieldAction paymentSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetCustomFieldAction).isInstanceOf(PaymentSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", PaymentSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", PaymentSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentSetCustomFieldAction value = PaymentSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentSetCustomFieldAction value = PaymentSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
