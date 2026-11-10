
package com.commercetools.api.models.staged_quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteDraftBuilder builder) {
        StagedQuoteDraft stagedQuoteDraft = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteDraft).isInstanceOf(StagedQuoteDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "quoteRequest", StagedQuoteDraft.builder()
                .quoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierImpl()) },
                new Object[] { "quoteRequestVersion", StagedQuoteDraft.builder().quoteRequestVersion(8L) },
                new Object[] { "quoteRequestStateToAccepted",
                        StagedQuoteDraft.builder().quoteRequestStateToAccepted(true) },
                new Object[] { "key", StagedQuoteDraft.builder().key("key") },
                new Object[] { "custom",
                        StagedQuoteDraft.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "state", StagedQuoteDraft.builder()
                        .state(new com.commercetools.api.models.state.StateReferenceImpl()) } };
    }

    @Test
    public void quoteRequest() {
        StagedQuoteDraft value = StagedQuoteDraft.of();
        value.setQuoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierImpl());
    }

    @Test
    public void quoteRequestVersion() {
        StagedQuoteDraft value = StagedQuoteDraft.of();
        value.setQuoteRequestVersion(8L);
        Assertions.assertThat(value.getQuoteRequestVersion()).isEqualTo(8L);
    }

    @Test
    public void quoteRequestStateToAccepted() {
        StagedQuoteDraft value = StagedQuoteDraft.of();
        value.setQuoteRequestStateToAccepted(true);
        Assertions.assertThat(value.getQuoteRequestStateToAccepted()).isEqualTo(true);
    }

    @Test
    public void key() {
        StagedQuoteDraft value = StagedQuoteDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void custom() {
        StagedQuoteDraft value = StagedQuoteDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void state() {
        StagedQuoteDraft value = StagedQuoteDraft.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }
}
