
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteStateTransitionMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteStateTransitionMessageBuilder builder) {
        StagedQuoteStateTransitionMessage stagedQuoteStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteStateTransitionMessage).isInstanceOf(StagedQuoteStateTransitionMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        StagedQuoteStateTransitionMessage.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldState",
                        StagedQuoteStateTransitionMessage.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", StagedQuoteStateTransitionMessage.builder().force(true) } };
    }

    @Test
    public void state() {
        StagedQuoteStateTransitionMessage value = StagedQuoteStateTransitionMessage.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        StagedQuoteStateTransitionMessage value = StagedQuoteStateTransitionMessage.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        StagedQuoteStateTransitionMessage value = StagedQuoteStateTransitionMessage.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
