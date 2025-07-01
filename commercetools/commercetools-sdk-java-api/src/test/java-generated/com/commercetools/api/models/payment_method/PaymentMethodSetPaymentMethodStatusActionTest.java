
package com.commercetools.api.models.payment_method;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodSetPaymentMethodStatusActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodSetPaymentMethodStatusActionBuilder builder) {
        PaymentMethodSetPaymentMethodStatusAction paymentMethodSetPaymentMethodStatusAction = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodSetPaymentMethodStatusAction)
                .isInstanceOf(PaymentMethodSetPaymentMethodStatusAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentMethodStatus",
                PaymentMethodSetPaymentMethodStatusAction.builder()
                        .paymentMethodStatus(
                            com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active")) } };
    }

    @Test
    public void paymentMethodStatus() {
        PaymentMethodSetPaymentMethodStatusAction value = PaymentMethodSetPaymentMethodStatusAction.of();
        value.setPaymentMethodStatus(
            com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
        Assertions.assertThat(value.getPaymentMethodStatus())
                .isEqualTo(com.commercetools.api.models.payment_method.PaymentMethodStatus.findEnum("Active"));
    }
}
