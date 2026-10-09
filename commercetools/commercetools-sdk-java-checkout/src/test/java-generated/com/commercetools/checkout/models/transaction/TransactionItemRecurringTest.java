
package com.commercetools.checkout.models.transaction;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionItemRecurringTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionItemRecurringBuilder builder) {
        TransactionItemRecurring transactionItemRecurring = builder.buildUnchecked();
        Assertions.assertThat(transactionItemRecurring).isInstanceOf(TransactionItemRecurring.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "paymentMethod", TransactionItemRecurring.builder()
                        .paymentMethod(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl()) },
                new Object[] { "connectorDeployment", TransactionItemRecurring.builder()
                        .connectorDeployment(
                            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl()) } };
    }

    @Test
    public void paymentMethod() {
        TransactionItemRecurring value = TransactionItemRecurring.of();
        value.setPaymentMethod(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl());
        Assertions.assertThat(value.getPaymentMethod())
                .isEqualTo(new com.commercetools.checkout.models.common.PaymentMethodReferenceImpl());
    }

    @Test
    public void connectorDeployment() {
        TransactionItemRecurring value = TransactionItemRecurring.of();
        value.setConnectorDeployment(
            new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
        Assertions.assertThat(value.getConnectorDeployment())
                .isEqualTo(
                    new com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReferenceImpl());
    }
}
