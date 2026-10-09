
package com.commercetools.checkout.models.recurring_payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentSetKeyUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentSetKeyUpdateActionBuilder builder) {
        RecurringPaymentSetKeyUpdateAction recurringPaymentSetKeyUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentSetKeyUpdateAction)
                .isInstanceOf(RecurringPaymentSetKeyUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurringPaymentSetKeyUpdateAction.builder().key("key") } };
    }

    @Test
    public void key() {
        RecurringPaymentSetKeyUpdateAction value = RecurringPaymentSetKeyUpdateAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
