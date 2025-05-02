
package com.commercetools.api.models.quote_request;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestChangeQuoteRequestStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestChangeQuoteRequestStateActionBuilder builder) {
        QuoteRequestChangeQuoteRequestStateAction quoteRequestChangeQuoteRequestStateAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestChangeQuoteRequestStateAction)
                .isInstanceOf(QuoteRequestChangeQuoteRequestStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quoteRequestState",
                QuoteRequestChangeQuoteRequestStateAction.builder()
                        .quoteRequestState(
                            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted")) } };
    }

    @Test
    public void quoteRequestState() {
        QuoteRequestChangeQuoteRequestStateAction value = QuoteRequestChangeQuoteRequestStateAction.of();
        value.setQuoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }
}
