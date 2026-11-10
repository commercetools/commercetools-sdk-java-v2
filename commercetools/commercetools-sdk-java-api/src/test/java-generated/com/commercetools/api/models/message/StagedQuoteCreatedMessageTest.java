
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteCreatedMessageBuilder builder) {
        StagedQuoteCreatedMessage stagedQuoteCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteCreatedMessage).isInstanceOf(StagedQuoteCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "stagedQuote", StagedQuoteCreatedMessage.builder()
                .stagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteImpl()) } };
    }

    @Test
    public void stagedQuote() {
        StagedQuoteCreatedMessage value = StagedQuoteCreatedMessage.of();
        value.setStagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
        Assertions.assertThat(value.getStagedQuote())
                .isEqualTo(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
    }
}
