
package com.commercetools.checkout.models.recurring_payment;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentUpdateActionsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentUpdateActionsBuilder builder) {
        RecurringPaymentUpdateActions recurringPaymentUpdateActions = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentUpdateActions).isInstanceOf(RecurringPaymentUpdateActions.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", RecurringPaymentUpdateActions.builder().version(2) },
                new Object[] { "actions", RecurringPaymentUpdateActions.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        RecurringPaymentUpdateActions value = RecurringPaymentUpdateActions.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void actions() {
        RecurringPaymentUpdateActions value = RecurringPaymentUpdateActions.of();
        value.setActions(Collections.singletonList(
            new com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.recurring_payment.RecurringPaymentUpdateActionImpl()));
    }
}
