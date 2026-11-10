
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomFieldChangedMessageBuilder builder) {
        PaymentMethodCustomFieldChangedMessage paymentMethodCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodCustomFieldChangedMessage)
                .isInstanceOf(PaymentMethodCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", PaymentMethodCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", PaymentMethodCustomFieldChangedMessage.builder().value("value") },
                new Object[] { "oldValue", PaymentMethodCustomFieldChangedMessage.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        PaymentMethodCustomFieldChangedMessage value = PaymentMethodCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodCustomFieldChangedMessage value = PaymentMethodCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        PaymentMethodCustomFieldChangedMessage value = PaymentMethodCustomFieldChangedMessage.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
