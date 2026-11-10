
package com.commercetools.checkout.models.recurring_payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentMethodConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentMethodConfigurationBuilder builder) {
        PaymentMethodConfiguration paymentMethodConfiguration = builder.buildUnchecked();
        Assertions.assertThat(paymentMethodConfiguration).isInstanceOf(PaymentMethodConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentMethod", PaymentMethodConfiguration.builder()
                        .paymentMethod(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl()) },
                new Object[] { "connectorDeployment", PaymentMethodConfiguration.builder()
                        .connectorDeployment(
                            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl()) } };
    }

    @Test
    public void paymentMethod() {
        PaymentMethodConfiguration value = PaymentMethodConfiguration.of();
        value.setPaymentMethod(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl());
        Assertions.assertThat(value.getPaymentMethod())
                .isEqualTo(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl());
    }

    @Test
    public void connectorDeployment() {
        PaymentMethodConfiguration value = PaymentMethodConfiguration.of();
        value.setConnectorDeployment(
            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
        Assertions.assertThat(value.getConnectorDeployment())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
    }
}
