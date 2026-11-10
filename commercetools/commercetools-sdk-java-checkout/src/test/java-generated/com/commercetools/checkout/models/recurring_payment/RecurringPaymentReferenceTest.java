
package com.commercetools.checkout.models.recurring_payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringPaymentReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringPaymentReferenceBuilder builder) {
        RecurringPaymentReference recurringPaymentReference = builder.buildUnchecked();
        Assertions.assertThat(recurringPaymentReference).isInstanceOf(RecurringPaymentReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurringPaymentReference.builder().id("id") } };
    }

    @Test
    public void id() {
        RecurringPaymentReference value = RecurringPaymentReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
