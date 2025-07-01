
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodMethodSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodMethodSetMessageBuilder builder) {
        PaymentMethodMethodSetMessage paymentMethodMethodSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodMethodSetMessage).isInstanceOf(PaymentMethodMethodSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "method", PaymentMethodMethodSetMessage.builder().method("method") },
                new Object[] { "oldMethod", PaymentMethodMethodSetMessage.builder().oldMethod("oldMethod") } };
    }

    @Test
    public void method() {
        PaymentMethodMethodSetMessage value = PaymentMethodMethodSetMessage.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void oldMethod() {
        PaymentMethodMethodSetMessage value = PaymentMethodMethodSetMessage.of();
        value.setOldMethod("oldMethod");
        Assertions.assertThat(value.getOldMethod()).isEqualTo("oldMethod");
    }
}
