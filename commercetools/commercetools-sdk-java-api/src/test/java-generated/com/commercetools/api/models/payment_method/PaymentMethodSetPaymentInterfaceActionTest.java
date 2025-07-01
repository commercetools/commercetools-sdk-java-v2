
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodSetPaymentInterfaceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodSetPaymentInterfaceActionBuilder builder) {
        PaymentMethodSetPaymentInterfaceAction paymentMethodSetPaymentInterfaceAction = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodSetPaymentInterfaceAction)
                .isInstanceOf(PaymentMethodSetPaymentInterfaceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentInterface",
                PaymentMethodSetPaymentInterfaceAction.builder().paymentInterface("paymentInterface") } };
    }

    @Test
    public void paymentInterface() {
        PaymentMethodSetPaymentInterfaceAction value = PaymentMethodSetPaymentInterfaceAction.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }
}
