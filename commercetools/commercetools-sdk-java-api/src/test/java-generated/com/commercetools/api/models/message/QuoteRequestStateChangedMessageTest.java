
package com.commercetools.api.models.message;

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
public class QuoteRequestStateChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestStateChangedMessageBuilder builder) {
        QuoteRequestStateChangedMessage quoteRequestStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestStateChangedMessage).isInstanceOf(QuoteRequestStateChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        QuoteRequestStateChangedMessage.builder()
                                .quoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState
                                        .findEnum("Submitted")) },
                new Object[] { QuoteRequestStateChangedMessage.builder()
                        .oldQuoteRequestState(
                            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted")) } };
    }

    @Test
    public void quoteRequestState() {
        QuoteRequestStateChangedMessage value = QuoteRequestStateChangedMessage.of();
        value.setQuoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }

    @Test
    public void oldQuoteRequestState() {
        QuoteRequestStateChangedMessage value = QuoteRequestStateChangedMessage.of();
        value.setOldQuoteRequestState(
            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getOldQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }
}
