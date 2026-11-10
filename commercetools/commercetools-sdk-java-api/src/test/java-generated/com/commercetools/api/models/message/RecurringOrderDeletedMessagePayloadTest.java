
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderDeletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderDeletedMessagePayloadBuilder builder) {
        RecurringOrderDeletedMessagePayload recurringOrderDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderDeletedMessagePayload)
                .isInstanceOf(RecurringOrderDeletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurringOrder", RecurringOrderDeletedMessagePayload.builder()
                .recurringOrder(new com.commercetools.api.models.recurring_order.RecurringOrderImpl()) } };
    }

    @Test
    public void recurringOrder() {
        RecurringOrderDeletedMessagePayload value = RecurringOrderDeletedMessagePayload.of();
        value.setRecurringOrder(new com.commercetools.api.models.recurring_order.RecurringOrderImpl());
        Assertions.assertThat(value.getRecurringOrder())
                .isEqualTo(new com.commercetools.api.models.recurring_order.RecurringOrderImpl());
    }
}
