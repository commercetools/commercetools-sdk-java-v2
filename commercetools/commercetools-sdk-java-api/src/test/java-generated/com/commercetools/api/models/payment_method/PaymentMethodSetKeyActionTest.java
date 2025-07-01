
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodSetKeyActionBuilder builder) {
        PaymentMethodSetKeyAction paymentMethodSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodSetKeyAction).isInstanceOf(PaymentMethodSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PaymentMethodSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        PaymentMethodSetKeyAction value = PaymentMethodSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
