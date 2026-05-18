
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetStatusUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetStatusUpdateActionBuilder builder) {
        SetStatusUpdateAction setStatusUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setStatusUpdateAction).isInstanceOf(SetStatusUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status",
                SetStatusUpdateAction.builder()
                        .status(com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus
                                .findEnum("Active")) } };
    }

    @Test
    public void status() {
        SetStatusUpdateAction value = SetStatusUpdateAction.of();
        value.setStatus(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(
                    com.commercetools.checkout.models.payment_integration.PaymentIntegrationStatus.findEnum("Active"));
    }
}
