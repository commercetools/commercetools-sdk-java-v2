
package com.commercetools.api.models.quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteDraftBuilder builder) {
        QuoteDraft quoteDraft = builder.buildUnchecked();
        Assertions.assertThat(quoteDraft).isInstanceOf(QuoteDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", QuoteDraft.builder().key("key") },
                new Object[] { "stagedQuote", QuoteDraft.builder()
                        .stagedQuote(
                            new com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierImpl()) },
                new Object[] { "stagedQuoteVersion", QuoteDraft.builder().stagedQuoteVersion(8L) },
                new Object[] { "stagedQuoteStateToSent", QuoteDraft.builder().stagedQuoteStateToSent(true) },
                new Object[] { "state",
                        QuoteDraft.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "custom",
                        QuoteDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        QuoteDraft value = QuoteDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void stagedQuote() {
        QuoteDraft value = QuoteDraft.of();
        value.setStagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierImpl());
        Assertions.assertThat(value.getStagedQuote())
                .isEqualTo(new com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierImpl());
    }

    @Test
    public void stagedQuoteVersion() {
        QuoteDraft value = QuoteDraft.of();
        value.setStagedQuoteVersion(8L);
        Assertions.assertThat(value.getStagedQuoteVersion()).isEqualTo(8L);
    }

    @Test
    public void stagedQuoteStateToSent() {
        QuoteDraft value = QuoteDraft.of();
        value.setStagedQuoteStateToSent(true);
        Assertions.assertThat(value.getStagedQuoteStateToSent()).isEqualTo(true);
    }

    @Test
    public void state() {
        QuoteDraft value = QuoteDraft.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void custom() {
        QuoteDraft value = QuoteDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
