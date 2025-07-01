
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodTokenTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodTokenBuilder builder) {
        PaymentMethodToken paymentMethodToken = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodToken).isInstanceOf(PaymentMethodToken.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "value", PaymentMethodToken.builder().value("value") } };
    }

    @Test
    public void value() {
        PaymentMethodToken value = PaymentMethodToken.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
