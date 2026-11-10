
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodSetMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodSetMethodActionBuilder builder) {
        PaymentMethodSetMethodAction paymentMethodSetMethodAction = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodSetMethodAction).isInstanceOf(PaymentMethodSetMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "method", PaymentMethodSetMethodAction.builder().method("method") } };
    }

    @Test
    public void method() {
        PaymentMethodSetMethodAction value = PaymentMethodSetMethodAction.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }
}
