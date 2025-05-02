
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestStateChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestStateChangedMessageBuilder builder) {
        QuoteRequestStateChangedMessage quoteRequestStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestStateChangedMessage).isInstanceOf(QuoteRequestStateChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quoteRequestState",
                        QuoteRequestStateChangedMessage.builder()
                                .quoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState
                                        .findEnum("Submitted")) },
                new Object[] { "oldQuoteRequestState", QuoteRequestStateChangedMessage.builder()
                        .oldQuoteRequestState(
                            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted")) } };
    }

    @Test
    public void quoteRequestState() {
        QuoteRequestStateChangedMessage value = QuoteRequestStateChangedMessage.of();
        value.setQuoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }

    @Test
    public void oldQuoteRequestState() {
        QuoteRequestStateChangedMessage value = QuoteRequestStateChangedMessage.of();
        value.setOldQuoteRequestState(
            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getOldQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }
}
