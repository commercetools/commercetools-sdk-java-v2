
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodSetDefaultActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodSetDefaultActionBuilder builder) {
        PaymentMethodSetDefaultAction paymentMethodSetDefaultAction = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodSetDefaultAction).isInstanceOf(PaymentMethodSetDefaultAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "default", PaymentMethodSetDefaultAction.builder()._default(true) } };
    }

    @Test
    public void _default() {
        PaymentMethodSetDefaultAction value = PaymentMethodSetDefaultAction.of();
        value.setDefault(true);
        Assertions.assertThat(value.getDefault()).isEqualTo(true);
    }
}
