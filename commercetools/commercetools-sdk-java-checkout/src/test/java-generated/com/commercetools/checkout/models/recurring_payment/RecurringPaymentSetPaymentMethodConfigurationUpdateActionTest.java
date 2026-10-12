
package com.commercetools.checkout.models.recurring_payment;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentSetPaymentMethodConfigurationUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder builder) {
        RecurringPaymentSetPaymentMethodConfigurationUpdateAction recurringPaymentSetPaymentMethodConfigurationUpdateAction = builder
                .buildUnchecked();
        Assertions.assertThat(recurringPaymentSetPaymentMethodConfigurationUpdateAction)
                .isInstanceOf(RecurringPaymentSetPaymentMethodConfigurationUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "paymentMethodConfigurations",
                RecurringPaymentSetPaymentMethodConfigurationUpdateAction.builder()
                        .paymentMethodConfigurations(Collections.singletonList(
                            new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl())) } };
    }

    @Test
    public void paymentMethodConfigurations() {
        RecurringPaymentSetPaymentMethodConfigurationUpdateAction value = RecurringPaymentSetPaymentMethodConfigurationUpdateAction
                .of();
        value.setPaymentMethodConfigurations(Collections.singletonList(
            new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl()));
        Assertions.assertThat(value.getPaymentMethodConfigurations())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.recurring_payment.PaymentMethodConfigurationImpl()));
    }
}
