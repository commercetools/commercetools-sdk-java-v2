
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderStateChangedMessageBuilder builder) {
        RecurringOrderStateChangedMessage recurringOrderStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderStateChangedMessage).isInstanceOf(RecurringOrderStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        RecurringOrderStateChangedMessage.builder()
                                .state(com.commercetools.api.models.recurring_order.RecurringOrderState
                                        .findEnum("Active")) },
                new Object[] { "oldState", RecurringOrderStateChangedMessage.builder()
                        .oldState(
                            com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active")) } };
    }

    @Test
    public void state() {
        RecurringOrderStateChangedMessage value = RecurringOrderStateChangedMessage.of();
        value.setState(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
    }

    @Test
    public void oldState() {
        RecurringOrderStateChangedMessage value = RecurringOrderStateChangedMessage.of();
        value.setOldState(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
        Assertions.assertThat(value.getOldState())
                .isEqualTo(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
    }
}
