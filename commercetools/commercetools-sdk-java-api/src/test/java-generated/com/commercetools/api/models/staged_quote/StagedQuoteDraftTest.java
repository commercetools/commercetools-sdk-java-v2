
package com.commercetools.api.models.staged_quote;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class StagedQuoteDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteDraftBuilder builder) {
        StagedQuoteDraft stagedQuoteDraft = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteDraft).isInstanceOf(StagedQuoteDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedQuoteDraft.builder()
                .quoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestResourceIdentifierImpl()) },
                new Object[] { StagedQuoteDraft.builder().quoteRequestVersion(8L) },
                new Object[] { StagedQuoteDraft.builder().quoteRequestStateToAccepted(true) },
                new Object[] { StagedQuoteDraft.builder().key("key") },
                new Object[] { StagedQuoteDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { StagedQuoteDraft.builder()
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
