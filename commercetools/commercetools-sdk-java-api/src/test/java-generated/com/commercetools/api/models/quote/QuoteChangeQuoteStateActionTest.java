
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
public class QuoteChangeQuoteStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteChangeQuoteStateActionBuilder builder) {
        QuoteChangeQuoteStateAction quoteChangeQuoteStateAction = builder.buildUnchecked();
        Assertions.assertThat(quoteChangeQuoteStateAction).isInstanceOf(QuoteChangeQuoteStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteChangeQuoteStateAction.builder()
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
