
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomFieldChangedMessageBuilder builder) {
        PaymentMethodInfoCustomFieldChangedMessage paymentMethodInfoCustomFieldChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomFieldChangedMessage)
                .isInstanceOf(PaymentMethodInfoCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodInfoCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", PaymentMethodInfoCustomFieldChangedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentMethodInfoCustomFieldChangedMessage value = PaymentMethodInfoCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodInfoCustomFieldChangedMessage value = PaymentMethodInfoCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
