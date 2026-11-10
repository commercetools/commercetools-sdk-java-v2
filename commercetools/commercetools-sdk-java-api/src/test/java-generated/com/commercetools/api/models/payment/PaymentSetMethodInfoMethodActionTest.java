
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetMethodInfoMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetMethodInfoMethodActionBuilder builder) {
        PaymentSetMethodInfoMethodAction paymentSetMethodInfoMethodAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetMethodInfoMethodAction).isInstanceOf(PaymentSetMethodInfoMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "method", PaymentSetMethodInfoMethodAction.builder().method("method") } };
    }

    @Test
    public void method() {
        PaymentSetMethodInfoMethodAction value = PaymentSetMethodInfoMethodAction.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }
}
