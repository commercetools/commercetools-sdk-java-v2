
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderStateTransitionMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderStateTransitionMessageBuilder builder) {
        RecurringOrderStateTransitionMessage recurringOrderStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderStateTransitionMessage)
                .isInstanceOf(RecurringOrderStateTransitionMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        RecurringOrderStateTransitionMessage.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldState",
                        RecurringOrderStateTransitionMessage.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", RecurringOrderStateTransitionMessage.builder().force(true) } };
    }

    @Test
    public void state() {
        RecurringOrderStateTransitionMessage value = RecurringOrderStateTransitionMessage.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        RecurringOrderStateTransitionMessage value = RecurringOrderStateTransitionMessage.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        RecurringOrderStateTransitionMessage value = RecurringOrderStateTransitionMessage.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
