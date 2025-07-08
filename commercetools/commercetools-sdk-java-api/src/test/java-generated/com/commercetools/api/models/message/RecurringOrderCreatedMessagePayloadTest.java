
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderCreatedMessagePayloadBuilder builder) {
        RecurringOrderCreatedMessagePayload recurringOrderCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderCreatedMessagePayload)
                .isInstanceOf(RecurringOrderCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "order", RecurringOrderCreatedMessagePayload.builder()
                .order(new com.commercetools.api.models.recurring_order.RecurringOrderImpl()) } };
    }

    @Test
    public void order() {
        RecurringOrderCreatedMessagePayload value = RecurringOrderCreatedMessagePayload.of();
        value.setOrder(new com.commercetools.api.models.recurring_order.RecurringOrderImpl());
        Assertions.assertThat(value.getOrder())
                .isEqualTo(new com.commercetools.api.models.recurring_order.RecurringOrderImpl());
    }
}
