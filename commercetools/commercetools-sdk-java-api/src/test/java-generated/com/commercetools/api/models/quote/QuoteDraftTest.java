
package com.commercetools.api.models.quote;

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
public class QuoteDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteDraftBuilder builder) {
        QuoteDraft quoteDraft = builder.buildUnchecked();
        Assertions.assertThat(quoteDraft).isInstanceOf(QuoteDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteDraft.builder().key("key") }, new Object[] { QuoteDraft.builder()
                .stagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteResourceIdentifierImpl()) },
                new Object[] { QuoteDraft.builder().stagedQuoteVersion(8L) },
                new Object[] { QuoteDraft.builder().stagedQuoteStateToSent(true) },
                new Object[] {
                        QuoteDraft.builder().state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] {
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
