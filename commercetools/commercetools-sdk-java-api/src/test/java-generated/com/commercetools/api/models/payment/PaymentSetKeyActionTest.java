
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetKeyActionBuilder builder) {
        PaymentSetKeyAction paymentSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetKeyAction).isInstanceOf(PaymentSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", PaymentSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        PaymentSetKeyAction value = PaymentSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
