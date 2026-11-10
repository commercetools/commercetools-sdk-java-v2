
package com.commercetools.api.models.staged_quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteTransitionStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteTransitionStateActionBuilder builder) {
        StagedQuoteTransitionStateAction stagedQuoteTransitionStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteTransitionStateAction).isInstanceOf(StagedQuoteTransitionStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        StagedQuoteTransitionStateAction.builder()
                                .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "force", StagedQuoteTransitionStateAction.builder().force(true) } };
    }

    @Test
    public void state() {
        StagedQuoteTransitionStateAction value = StagedQuoteTransitionStateAction.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void force() {
        StagedQuoteTransitionStateAction value = StagedQuoteTransitionStateAction.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
