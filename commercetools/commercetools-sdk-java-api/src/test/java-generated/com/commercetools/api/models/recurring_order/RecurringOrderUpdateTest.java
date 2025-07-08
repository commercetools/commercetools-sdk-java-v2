
package com.commercetools.api.models.recurring_order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderUpdateBuilder builder) {
        RecurringOrderUpdate recurringOrderUpdate = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderUpdate).isInstanceOf(RecurringOrderUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", RecurringOrderUpdate.builder().version(2L) },
                new Object[] { "actions", RecurringOrderUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.recurring_order.RecurringOrderUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        RecurringOrderUpdate value = RecurringOrderUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        RecurringOrderUpdate value = RecurringOrderUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.recurring_order.RecurringOrderUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.recurring_order.RecurringOrderUpdateActionImpl()));
    }
}
