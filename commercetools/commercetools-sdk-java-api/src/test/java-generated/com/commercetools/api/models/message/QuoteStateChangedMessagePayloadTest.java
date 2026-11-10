
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteStateChangedMessagePayloadBuilder builder) {
        QuoteStateChangedMessagePayload quoteStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteStateChangedMessagePayload).isInstanceOf(QuoteStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quoteState",
                        QuoteStateChangedMessagePayload.builder()
                                .quoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending")) },
                new Object[] { "oldQuoteState", QuoteStateChangedMessagePayload.builder()
                        .oldQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending")) } };
    }

    @Test
    public void quoteState() {
        QuoteStateChangedMessagePayload value = QuoteStateChangedMessagePayload.of();
        value.setQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getQuoteState())
                .isEqualTo(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
    }

    @Test
    public void oldQuoteState() {
        QuoteStateChangedMessagePayload value = QuoteStateChangedMessagePayload.of();
        value.setOldQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getOldQuoteState())
                .isEqualTo(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
    }
}
