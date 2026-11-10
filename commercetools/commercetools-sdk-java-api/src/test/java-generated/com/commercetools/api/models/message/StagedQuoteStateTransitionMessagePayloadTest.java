
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteStateTransitionMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteStateTransitionMessagePayloadBuilder builder) {
        StagedQuoteStateTransitionMessagePayload stagedQuoteStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteStateTransitionMessagePayload)
                .isInstanceOf(StagedQuoteStateTransitionMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        StagedQuoteStateTransitionMessagePayload.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldState",
                        StagedQuoteStateTransitionMessagePayload.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", StagedQuoteStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void state() {
        StagedQuoteStateTransitionMessagePayload value = StagedQuoteStateTransitionMessagePayload.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        StagedQuoteStateTransitionMessagePayload value = StagedQuoteStateTransitionMessagePayload.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        StagedQuoteStateTransitionMessagePayload value = StagedQuoteStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
