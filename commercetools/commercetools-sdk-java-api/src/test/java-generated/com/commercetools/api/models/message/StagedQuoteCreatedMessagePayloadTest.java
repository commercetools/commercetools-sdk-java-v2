
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteCreatedMessagePayloadBuilder builder) {
        StagedQuoteCreatedMessagePayload stagedQuoteCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteCreatedMessagePayload).isInstanceOf(StagedQuoteCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stagedQuote", StagedQuoteCreatedMessagePayload.builder()
                .stagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteImpl()) } };
    }

    @Test
    public void stagedQuote() {
        StagedQuoteCreatedMessagePayload value = StagedQuoteCreatedMessagePayload.of();
        value.setStagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
        Assertions.assertThat(value.getStagedQuote())
                .isEqualTo(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
    }
}
