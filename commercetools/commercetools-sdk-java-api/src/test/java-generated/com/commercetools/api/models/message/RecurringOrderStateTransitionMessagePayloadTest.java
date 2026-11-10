
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderStateTransitionMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderStateTransitionMessagePayloadBuilder builder) {
        RecurringOrderStateTransitionMessagePayload recurringOrderStateTransitionMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(recurringOrderStateTransitionMessagePayload)
                .isInstanceOf(RecurringOrderStateTransitionMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        RecurringOrderStateTransitionMessagePayload.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldState",
                        RecurringOrderStateTransitionMessagePayload.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", RecurringOrderStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void state() {
        RecurringOrderStateTransitionMessagePayload value = RecurringOrderStateTransitionMessagePayload.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        RecurringOrderStateTransitionMessagePayload value = RecurringOrderStateTransitionMessagePayload.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        RecurringOrderStateTransitionMessagePayload value = RecurringOrderStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
