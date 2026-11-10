
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodDefaultSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodDefaultSetMessageBuilder builder) {
        PaymentMethodDefaultSetMessage paymentMethodDefaultSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodDefaultSetMessage).isInstanceOf(PaymentMethodDefaultSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "default", PaymentMethodDefaultSetMessage.builder()._default(true) },
                new Object[] { "oldDefault", PaymentMethodDefaultSetMessage.builder().oldDefault(true) } };
    }

    @Test
    public void _default() {
        PaymentMethodDefaultSetMessage value = PaymentMethodDefaultSetMessage.of();
        value.setDefault(true);
        Assertions.assertThat(value.getDefault()).isEqualTo(true);
    }

    @Test
    public void oldDefault() {
        PaymentMethodDefaultSetMessage value = PaymentMethodDefaultSetMessage.of();
        value.setOldDefault(true);
        Assertions.assertThat(value.getOldDefault()).isEqualTo(true);
    }
}
