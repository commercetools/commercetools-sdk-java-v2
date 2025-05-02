
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteCreatedMessageBuilder builder) {
        QuoteCreatedMessage quoteCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteCreatedMessage).isInstanceOf(QuoteCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quote",
                QuoteCreatedMessage.builder().quote(new com.commercetools.api.models.quote.QuoteImpl()) } };
    }

    @Test
    public void quote() {
        QuoteCreatedMessage value = QuoteCreatedMessage.of();
        value.setQuote(new com.commercetools.api.models.quote.QuoteImpl());
        Assertions.assertThat(value.getQuote()).isEqualTo(new com.commercetools.api.models.quote.QuoteImpl());
    }
}
