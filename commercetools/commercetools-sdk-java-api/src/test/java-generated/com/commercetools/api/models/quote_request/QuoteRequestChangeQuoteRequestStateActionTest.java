
package com.commercetools.api.models.quote_request;

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
public class QuoteRequestChangeQuoteRequestStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestChangeQuoteRequestStateActionBuilder builder) {
        QuoteRequestChangeQuoteRequestStateAction quoteRequestChangeQuoteRequestStateAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestChangeQuoteRequestStateAction)
                .isInstanceOf(QuoteRequestChangeQuoteRequestStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteRequestChangeQuoteRequestStateAction.builder()
                .quoteRequestState(
                    com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted")) } };
    }

    @Test
    public void quoteRequestState() {
        QuoteRequestChangeQuoteRequestStateAction value = QuoteRequestChangeQuoteRequestStateAction.of();
        value.setQuoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }
}
