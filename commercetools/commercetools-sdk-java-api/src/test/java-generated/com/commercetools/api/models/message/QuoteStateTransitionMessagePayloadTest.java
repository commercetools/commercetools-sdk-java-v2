
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteStateTransitionMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteStateTransitionMessagePayloadBuilder builder) {
        QuoteStateTransitionMessagePayload quoteStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteStateTransitionMessagePayload)
                .isInstanceOf(QuoteStateTransitionMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        QuoteStateTransitionMessagePayload.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldState",
                        QuoteStateTransitionMessagePayload.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", QuoteStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void state() {
        QuoteStateTransitionMessagePayload value = QuoteStateTransitionMessagePayload.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        QuoteStateTransitionMessagePayload value = QuoteStateTransitionMessagePayload.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        QuoteStateTransitionMessagePayload value = QuoteStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
