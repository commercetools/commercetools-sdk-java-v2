
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodInfoBuilder builder) {
        PaymentMethodInfo paymentMethodInfo = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodInfo).isInstanceOf(PaymentMethodInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentInterface", PaymentMethodInfo.builder().paymentInterface("paymentInterface") },
                new Object[] { "method", PaymentMethodInfo.builder().method("method") },
                new Object[] { "name", PaymentMethodInfo.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void paymentInterface() {
        PaymentMethodInfo value = PaymentMethodInfo.of();
        value.setPaymentInterface("paymentInterface");
        Assertions.assertThat(value.getPaymentInterface()).isEqualTo("paymentInterface");
    }

    @Test
    public void method() {
        PaymentMethodInfo value = PaymentMethodInfo.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }

    @Test
    public void name() {
        PaymentMethodInfo value = PaymentMethodInfo.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
