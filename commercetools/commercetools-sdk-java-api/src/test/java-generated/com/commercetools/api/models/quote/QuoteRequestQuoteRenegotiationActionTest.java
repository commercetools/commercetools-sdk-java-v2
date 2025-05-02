
package com.commercetools.api.models.quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestQuoteRenegotiationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestQuoteRenegotiationActionBuilder builder) {
        QuoteRequestQuoteRenegotiationAction quoteRequestQuoteRenegotiationAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestQuoteRenegotiationAction)
                .isInstanceOf(QuoteRequestQuoteRenegotiationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "buyerComment",
                QuoteRequestQuoteRenegotiationAction.builder().buyerComment("buyerComment") } };
    }

    @Test
    public void buyerComment() {
        QuoteRequestQuoteRenegotiationAction value = QuoteRequestQuoteRenegotiationAction.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }
}
