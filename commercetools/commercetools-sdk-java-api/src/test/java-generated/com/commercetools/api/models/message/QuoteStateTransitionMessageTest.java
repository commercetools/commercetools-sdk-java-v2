
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteStateTransitionMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteStateTransitionMessageBuilder builder) {
        QuoteStateTransitionMessage quoteStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteStateTransitionMessage).isInstanceOf(QuoteStateTransitionMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        QuoteStateTransitionMessage.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldState",
                        QuoteStateTransitionMessage.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", QuoteStateTransitionMessage.builder().force(true) } };
    }

    @Test
    public void state() {
        QuoteStateTransitionMessage value = QuoteStateTransitionMessage.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        QuoteStateTransitionMessage value = QuoteStateTransitionMessage.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        QuoteStateTransitionMessage value = QuoteStateTransitionMessage.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
