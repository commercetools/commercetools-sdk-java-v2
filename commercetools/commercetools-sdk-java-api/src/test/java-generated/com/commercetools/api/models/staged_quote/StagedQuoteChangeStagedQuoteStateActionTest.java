
package com.commercetools.api.models.staged_quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteChangeStagedQuoteStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteChangeStagedQuoteStateActionBuilder builder) {
        StagedQuoteChangeStagedQuoteStateAction stagedQuoteChangeStagedQuoteStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteChangeStagedQuoteStateAction)
                .isInstanceOf(StagedQuoteChangeStagedQuoteStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stagedQuoteState",
                StagedQuoteChangeStagedQuoteStateAction.builder()
                        .stagedQuoteState(
                            com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress")) } };
    }

    @Test
    public void stagedQuoteState() {
        StagedQuoteChangeStagedQuoteStateAction value = StagedQuoteChangeStagedQuoteStateAction.of();
        value.setStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }
}
