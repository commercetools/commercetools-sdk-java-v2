
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoCustomFieldRemovedMessageBuilder builder) {
        PaymentMethodInfoCustomFieldRemovedMessage paymentMethodInfoCustomFieldRemovedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(paymentMethodInfoCustomFieldRemovedMessage)
                .isInstanceOf(PaymentMethodInfoCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodInfoCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        PaymentMethodInfoCustomFieldRemovedMessage value = PaymentMethodInfoCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
