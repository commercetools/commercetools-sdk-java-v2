
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentSetMethodInfoTokenActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentSetMethodInfoTokenActionBuilder builder) {
        PaymentSetMethodInfoTokenAction paymentSetMethodInfoTokenAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetMethodInfoTokenAction).isInstanceOf(PaymentSetMethodInfoTokenAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "token", PaymentSetMethodInfoTokenAction.builder()
                .token(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl()) } };
    }

    @Test
    public void token() {
        PaymentSetMethodInfoTokenAction value = PaymentSetMethodInfoTokenAction.of();
        value.setToken(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
        Assertions.assertThat(value.getToken())
                .isEqualTo(new com.commercetools.api.models.payment_method.PaymentMethodTokenImpl());
    }
}
