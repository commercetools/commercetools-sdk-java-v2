
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentsConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentsConfigurationBuilder builder) {
        PaymentsConfiguration paymentsConfiguration = builder.buildUnchecked();
        Assertions.assertThat(paymentsConfiguration).isInstanceOf(PaymentsConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentReturnUrl",
                        PaymentsConfiguration.builder().paymentReturnUrl("paymentReturnUrl") },
                new Object[] { "activePaymentComponentType",
                        PaymentsConfiguration.builder()
                                .activePaymentComponentType(
                                    com.commercetools.checkout.models.payment_integration.PaymentComponentType
                                            .findEnum("Component")) } };
    }

    @Test
    public void paymentReturnUrl() {
        PaymentsConfiguration value = PaymentsConfiguration.of();
        value.setPaymentReturnUrl("paymentReturnUrl");
        Assertions.assertThat(value.getPaymentReturnUrl()).isEqualTo("paymentReturnUrl");
    }

    @Test
    public void activePaymentComponentType() {
        PaymentsConfiguration value = PaymentsConfiguration.of();
        value.setActivePaymentComponentType(
            com.commercetools.checkout.models.payment_integration.PaymentComponentType.findEnum("Component"));
        Assertions.assertThat(value.getActivePaymentComponentType())
                .isEqualTo(
                    com.commercetools.checkout.models.payment_integration.PaymentComponentType.findEnum("Component"));
    }
}
