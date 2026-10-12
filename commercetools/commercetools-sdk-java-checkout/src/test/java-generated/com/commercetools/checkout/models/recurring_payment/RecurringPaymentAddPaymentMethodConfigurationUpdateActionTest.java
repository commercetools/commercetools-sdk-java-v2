
package com.commercetools.checkout.models.recurring_payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentAddPaymentMethodConfigurationUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder builder) {
        RecurringPaymentAddPaymentMethodConfigurationUpdateAction recurringPaymentAddPaymentMethodConfigurationUpdateAction = builder
                .buildUnchecked();
        Assertions.assertThat(recurringPaymentAddPaymentMethodConfigurationUpdateAction)
                .isInstanceOf(RecurringPaymentAddPaymentMethodConfigurationUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentMethodConfiguration",
                RecurringPaymentAddPaymentMethodConfigurationUpdateAction.builder()
                        .paymentMethodConfiguration(
                            new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl()) } };
    }

    @Test
    public void paymentMethodConfiguration() {
        RecurringPaymentAddPaymentMethodConfigurationUpdateAction value = RecurringPaymentAddPaymentMethodConfigurationUpdateAction
                .of();
        value.setPaymentMethodConfiguration(
            new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl());
        Assertions.assertThat(value.getPaymentMethodConfiguration())
                .isEqualTo(new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl());
    }
}
