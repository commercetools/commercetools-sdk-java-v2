
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestCreatedMessageBuilder builder) {
        QuoteRequestCreatedMessage quoteRequestCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestCreatedMessage).isInstanceOf(QuoteRequestCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quoteRequest", QuoteRequestCreatedMessage.builder()
                .quoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestImpl()) } };
    }

    @Test
    public void quoteRequest() {
        QuoteRequestCreatedMessage value = QuoteRequestCreatedMessage.of();
        value.setQuoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
    }
}
