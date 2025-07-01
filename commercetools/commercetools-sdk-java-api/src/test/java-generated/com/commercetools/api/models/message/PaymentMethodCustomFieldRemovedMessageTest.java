
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodCustomFieldRemovedMessageBuilder builder) {
        PaymentMethodCustomFieldRemovedMessage paymentMethodCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodCustomFieldRemovedMessage)
                .isInstanceOf(PaymentMethodCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", PaymentMethodCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        PaymentMethodCustomFieldRemovedMessage value = PaymentMethodCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
