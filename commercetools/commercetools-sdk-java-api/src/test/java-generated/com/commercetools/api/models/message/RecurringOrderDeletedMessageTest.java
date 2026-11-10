
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderDeletedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderDeletedMessageBuilder builder) {
        RecurringOrderDeletedMessage recurringOrderDeletedMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderDeletedMessage).isInstanceOf(RecurringOrderDeletedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "recurringOrder", RecurringOrderDeletedMessage.builder()
                .recurringOrder(new com.commercetools.api.models.recurring_order.RecurringOrderImpl()) } };
    }

    @Test
    public void recurringOrder() {
        RecurringOrderDeletedMessage value = RecurringOrderDeletedMessage.of();
        value.setRecurringOrder(new com.commercetools.api.models.recurring_order.RecurringOrderImpl());
        Assertions.assertThat(value.getRecurringOrder())
                .isEqualTo(new com.commercetools.api.models.recurring_order.RecurringOrderImpl());
    }
}
