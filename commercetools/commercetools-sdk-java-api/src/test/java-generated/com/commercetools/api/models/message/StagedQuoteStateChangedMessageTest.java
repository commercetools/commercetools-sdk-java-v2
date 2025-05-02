
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteStateChangedMessageBuilder builder) {
        StagedQuoteStateChangedMessage stagedQuoteStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteStateChangedMessage).isInstanceOf(StagedQuoteStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "stagedQuoteState",
                        StagedQuoteStateChangedMessage.builder()
                                .stagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState
                                        .findEnum("InProgress")) },
                new Object[] { "oldStagedQuoteState", StagedQuoteStateChangedMessage.builder()
                        .oldStagedQuoteState(
                            com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress")) } };
    }

    @Test
    public void stagedQuoteState() {
        StagedQuoteStateChangedMessage value = StagedQuoteStateChangedMessage.of();
        value.setStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }

    @Test
    public void oldStagedQuoteState() {
        StagedQuoteStateChangedMessage value = StagedQuoteStateChangedMessage.of();
        value.setOldStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getOldStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }
}
