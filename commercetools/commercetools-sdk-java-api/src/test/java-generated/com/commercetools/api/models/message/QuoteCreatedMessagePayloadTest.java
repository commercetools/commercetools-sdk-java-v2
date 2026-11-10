
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteCreatedMessagePayloadBuilder builder) {
        QuoteCreatedMessagePayload quoteCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteCreatedMessagePayload).isInstanceOf(QuoteCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quote",
                QuoteCreatedMessagePayload.builder().quote(new com.commercetools.api.models.quote.QuoteImpl()) } };
    }

    @Test
    public void quote() {
        QuoteCreatedMessagePayload value = QuoteCreatedMessagePayload.of();
        value.setQuote(new com.commercetools.api.models.quote.QuoteImpl());
        Assertions.assertThat(value.getQuote()).isEqualTo(new com.commercetools.api.models.quote.QuoteImpl());
    }
}
