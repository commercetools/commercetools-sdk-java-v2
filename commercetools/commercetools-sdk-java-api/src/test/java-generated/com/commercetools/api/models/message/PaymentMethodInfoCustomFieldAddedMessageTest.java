
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomFieldAddedMessageBuilder builder) {
        PaymentMethodInfoCustomFieldAddedMessage paymentMethodInfoCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomFieldAddedMessage)
                .isInstanceOf(PaymentMethodInfoCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodInfoCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", PaymentMethodInfoCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentMethodInfoCustomFieldAddedMessage value = PaymentMethodInfoCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodInfoCustomFieldAddedMessage value = PaymentMethodInfoCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
