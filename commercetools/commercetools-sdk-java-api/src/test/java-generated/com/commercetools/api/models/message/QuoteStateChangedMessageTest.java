
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteStateChangedMessageBuilder builder) {
        QuoteStateChangedMessage quoteStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteStateChangedMessage).isInstanceOf(QuoteStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quoteState",
                        QuoteStateChangedMessage.builder()
                                .quoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending")) },
                new Object[] { "oldQuoteState", QuoteStateChangedMessage.builder()
                        .oldQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending")) } };
    }

    @Test
    public void quoteState() {
        QuoteStateChangedMessage value = QuoteStateChangedMessage.of();
        value.setQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getQuoteState())
                .isEqualTo(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
    }

    @Test
    public void oldQuoteState() {
        QuoteStateChangedMessage value = QuoteStateChangedMessage.of();
        value.setOldQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getOldQuoteState())
                .isEqualTo(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
    }
}
