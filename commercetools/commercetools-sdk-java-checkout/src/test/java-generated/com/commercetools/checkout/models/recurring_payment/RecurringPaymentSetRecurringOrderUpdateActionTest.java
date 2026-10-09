
package com.commercetools.checkout.models.recurring_payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentSetRecurringOrderUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentSetRecurringOrderUpdateActionBuilder builder) {
        RecurringPaymentSetRecurringOrderUpdateAction recurringPaymentSetRecurringOrderUpdateAction = builder
                .buildUnchecked();
        Assertions.assertThat(recurringPaymentSetRecurringOrderUpdateAction)
                .isInstanceOf(RecurringPaymentSetRecurringOrderUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurringOrder",
                RecurringPaymentSetRecurringOrderUpdateAction.builder()
                        .recurringOrder(
                            new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl()) } };
    }

    @Test
    public void recurringOrder() {
        RecurringPaymentSetRecurringOrderUpdateAction value = RecurringPaymentSetRecurringOrderUpdateAction.of();
        value.setRecurringOrder(new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl());
        Assertions.assertThat(value.getRecurringOrder())
                .isEqualTo(new com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceImpl());
    }
}
