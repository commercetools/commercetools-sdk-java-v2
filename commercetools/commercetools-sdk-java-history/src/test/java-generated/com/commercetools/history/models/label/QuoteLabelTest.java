
package com.commercetools.history.models.label;

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
public class QuoteLabelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteLabelBuilder builder) {
        QuoteLabel quoteLabel = builder.buildUnchecked();
        Assertions.assertThat(quoteLabel).isInstanceOf(QuoteLabel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteLabel.builder().key("key") },
                new Object[] {
                        QuoteLabel.builder().customer(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] {
                        QuoteLabel.builder().stagedQuote(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { QuoteLabel.builder()
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
