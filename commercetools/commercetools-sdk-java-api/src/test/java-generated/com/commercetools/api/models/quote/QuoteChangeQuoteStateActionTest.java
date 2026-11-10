
package com.commercetools.api.models.quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteChangeQuoteStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteChangeQuoteStateActionBuilder builder) {
        QuoteChangeQuoteStateAction quoteChangeQuoteStateAction = builder.buildUnchecked();
        Assertions.assertThat(quoteChangeQuoteStateAction).isInstanceOf(QuoteChangeQuoteStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quoteState", QuoteChangeQuoteStateAction.builder()
                .quoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending")) } };
    }

    @Test
    public void quoteState() {
        QuoteChangeQuoteStateAction value = QuoteChangeQuoteStateAction.of();
        value.setQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getQuoteState())
                .isEqualTo(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
    }
}
