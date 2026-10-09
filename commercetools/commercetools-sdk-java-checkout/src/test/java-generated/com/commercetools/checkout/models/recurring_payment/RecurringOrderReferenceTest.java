
package com.commercetools.checkout.models.recurring_payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderReferenceBuilder builder) {
        RecurringOrderReference recurringOrderReference = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderReference).isInstanceOf(RecurringOrderReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurringOrderReference.builder().id("id") } };
    }

    @Test
    public void id() {
        RecurringOrderReference value = RecurringOrderReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
