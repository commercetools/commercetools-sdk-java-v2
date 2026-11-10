
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestStateChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestStateChangedMessagePayloadBuilder builder) {
        QuoteRequestStateChangedMessagePayload quoteRequestStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestStateChangedMessagePayload)
                .isInstanceOf(QuoteRequestStateChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "quoteRequestState",
                        QuoteRequestStateChangedMessagePayload.builder()
                                .quoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState
                                        .findEnum("Submitted")) },
                new Object[] { "oldQuoteRequestState", QuoteRequestStateChangedMessagePayload.builder()
                        .oldQuoteRequestState(
                            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted")) } };
    }

    @Test
    public void quoteRequestState() {
        QuoteRequestStateChangedMessagePayload value = QuoteRequestStateChangedMessagePayload.of();
        value.setQuoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }

    @Test
    public void oldQuoteRequestState() {
        QuoteRequestStateChangedMessagePayload value = QuoteRequestStateChangedMessagePayload.of();
        value.setOldQuoteRequestState(
            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getOldQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }
}
