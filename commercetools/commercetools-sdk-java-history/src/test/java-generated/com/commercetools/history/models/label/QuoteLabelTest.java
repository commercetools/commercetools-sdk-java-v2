
package com.commercetools.history.models.label;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteLabelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteLabelBuilder builder) {
        QuoteLabel quoteLabel = builder.buildUnchecked();
        Assertions.assertThat(quoteLabel).isInstanceOf(QuoteLabel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", QuoteLabel.builder().key("key") },
                new Object[] { "customer",
                        QuoteLabel.builder().customer(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "stagedQuote",
                        QuoteLabel.builder().stagedQuote(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "quoteRequest", QuoteLabel.builder()
                        .quoteRequest(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void key() {
        QuoteLabel value = QuoteLabel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customer() {
        QuoteLabel value = QuoteLabel.of();
        value.setCustomer(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void stagedQuote() {
        QuoteLabel value = QuoteLabel.of();
        value.setStagedQuote(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getStagedQuote())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void quoteRequest() {
        QuoteLabel value = QuoteLabel.of();
        value.setQuoteRequest(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
