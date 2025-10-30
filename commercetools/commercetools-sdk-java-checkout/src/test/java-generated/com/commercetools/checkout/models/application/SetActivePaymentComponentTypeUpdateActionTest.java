
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetActivePaymentComponentTypeUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetActivePaymentComponentTypeUpdateActionBuilder builder) {
        SetActivePaymentComponentTypeUpdateAction setActivePaymentComponentTypeUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setActivePaymentComponentTypeUpdateAction)
                .isInstanceOf(SetActivePaymentComponentTypeUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "activePaymentComponentType",
                SetActivePaymentComponentTypeUpdateAction.builder()
                        .activePaymentComponentType(
                            com.commercetools.checkout.models.payment_integration.PaymentComponentType
                                    .findEnum("Component")) } };
    }

    @Test
    public void activePaymentComponentType() {
        SetActivePaymentComponentTypeUpdateAction value = SetActivePaymentComponentTypeUpdateAction.of();
        value.setActivePaymentComponentType(
            com.commercetools.checkout.models.payment_integration.PaymentComponentType.findEnum("Component"));
        Assertions.assertThat(value.getActivePaymentComponentType())
                .isEqualTo(
                    com.commercetools.checkout.models.payment_integration.PaymentComponentType.findEnum("Component"));
    }
}
