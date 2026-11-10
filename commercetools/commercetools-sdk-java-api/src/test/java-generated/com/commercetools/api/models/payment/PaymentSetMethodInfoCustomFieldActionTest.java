
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetMethodInfoCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetMethodInfoCustomFieldActionBuilder builder) {
        PaymentSetMethodInfoCustomFieldAction paymentSetMethodInfoCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetMethodInfoCustomFieldAction)
                .isInstanceOf(PaymentSetMethodInfoCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", PaymentSetMethodInfoCustomFieldAction.builder().name("name") },
                new Object[] { "value", PaymentSetMethodInfoCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentSetMethodInfoCustomFieldAction value = PaymentSetMethodInfoCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentSetMethodInfoCustomFieldAction value = PaymentSetMethodInfoCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
