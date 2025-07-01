
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomFieldAddedMessageBuilder builder) {
        PaymentMethodCustomFieldAddedMessage paymentMethodCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodCustomFieldAddedMessage)
                .isInstanceOf(PaymentMethodCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", PaymentMethodCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", PaymentMethodCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        PaymentMethodCustomFieldAddedMessage value = PaymentMethodCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentMethodCustomFieldAddedMessage value = PaymentMethodCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
