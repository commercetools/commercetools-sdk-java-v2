
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteStateChangedMessagePayloadBuilder builder) {
        StagedQuoteStateChangedMessagePayload stagedQuoteStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteStateChangedMessagePayload)
                .isInstanceOf(StagedQuoteStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "stagedQuoteState",
                        StagedQuoteStateChangedMessagePayload.builder()
                                .stagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState
                                        .findEnum("InProgress")) },
                new Object[] { "oldStagedQuoteState", StagedQuoteStateChangedMessagePayload.builder()
                        .oldStagedQuoteState(
                            com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress")) } };
    }

    @Test
    public void stagedQuoteState() {
        StagedQuoteStateChangedMessagePayload value = StagedQuoteStateChangedMessagePayload.of();
        value.setStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }

    @Test
    public void oldStagedQuoteState() {
        StagedQuoteStateChangedMessagePayload value = StagedQuoteStateChangedMessagePayload.of();
        value.setOldStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getOldStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }
}
