
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestCreatedMessagePayloadBuilder builder) {
        QuoteRequestCreatedMessagePayload quoteRequestCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestCreatedMessagePayload).isInstanceOf(QuoteRequestCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quoteRequest", QuoteRequestCreatedMessagePayload.builder()
                .quoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestImpl()) } };
    }

    @Test
    public void quoteRequest() {
        QuoteRequestCreatedMessagePayload value = QuoteRequestCreatedMessagePayload.of();
        value.setQuoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
    }
}
