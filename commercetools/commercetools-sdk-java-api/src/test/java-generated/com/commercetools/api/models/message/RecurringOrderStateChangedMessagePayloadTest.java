
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderStateChangedMessagePayloadBuilder builder) {
        RecurringOrderStateChangedMessagePayload recurringOrderStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderStateChangedMessagePayload)
                .isInstanceOf(RecurringOrderStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        RecurringOrderStateChangedMessagePayload.builder()
                                .state(com.commercetools.api.models.recurring_order.RecurringOrderState
                                        .findEnum("Active")) },
                new Object[] { "oldState", RecurringOrderStateChangedMessagePayload.builder()
                        .oldState(
                            com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active")) } };
    }

    @Test
    public void state() {
        RecurringOrderStateChangedMessagePayload value = RecurringOrderStateChangedMessagePayload.of();
        value.setState(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
    }

    @Test
    public void oldState() {
        RecurringOrderStateChangedMessagePayload value = RecurringOrderStateChangedMessagePayload.of();
        value.setOldState(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
        Assertions.assertThat(value.getOldState())
                .isEqualTo(com.commercetools.api.models.recurring_order.RecurringOrderState.findEnum("Active"));
    }
}
