
package com.commercetools.checkout.models.payment_integration;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntegrationUpdateActionsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntegrationUpdateActionsBuilder builder) {
        PaymentIntegrationUpdateActions paymentIntegrationUpdateActions = builder.buildUnchecked();
        Assertions.assertThat(paymentIntegrationUpdateActions).isInstanceOf(PaymentIntegrationUpdateActions.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", PaymentIntegrationUpdateActions.builder().version(2) },
                new Object[] { "actions", PaymentIntegrationUpdateActions.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        PaymentIntegrationUpdateActions value = PaymentIntegrationUpdateActions.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void actions() {
        PaymentIntegrationUpdateActions value = PaymentIntegrationUpdateActions.of();
        value.setActions(Collections.singletonList(
            new com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionImpl()));
    }
}
