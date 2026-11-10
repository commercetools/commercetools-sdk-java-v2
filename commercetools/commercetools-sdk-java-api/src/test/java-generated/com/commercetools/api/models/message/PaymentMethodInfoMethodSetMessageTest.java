
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoMethodSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoMethodSetMessageBuilder builder) {
        PaymentMethodInfoMethodSetMessage paymentMethodInfoMethodSetMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfoMethodSetMessage).isInstanceOf(PaymentMethodInfoMethodSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "method", PaymentMethodInfoMethodSetMessage.builder().method("method") },
                new Object[] { "oldMethod", PaymentMethodInfoMethodSetMessage.builder().oldMethod("oldMethod") } };
    }

    @Test
    public void method() {
        PaymentMethodInfoMethodSetMessage value = PaymentMethodInfoMethodSetMessage.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void oldMethod() {
        PaymentMethodInfoMethodSetMessage value = PaymentMethodInfoMethodSetMessage.of();
        value.setOldMethod("oldMethod");
        Assertions.assertThat(value.getOldMethod()).isEqualTo("oldMethod");
    }
}
