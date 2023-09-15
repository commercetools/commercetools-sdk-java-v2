
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
public class QuoteRequestStateChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestStateChangedMessagePayloadBuilder builder) {
        QuoteRequestStateChangedMessagePayload quoteRequestStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestStateChangedMessagePayload)
                .isInstanceOf(QuoteRequestStateChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        QuoteRequestStateChangedMessagePayload.builder()
                                .quoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState
                                        .findEnum("Submitted")) },
                new Object[] { QuoteRequestStateChangedMessagePayload.builder()
                        .oldQuoteRequestState(
                            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted")) } };
    }

    @Test
    public void quoteRequestState() {
        QuoteRequestStateChangedMessagePayload value = QuoteRequestStateChangedMessagePayload.of();
        value.setQuoteRequestState(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }

    @Test
    public void oldQuoteRequestState() {
        QuoteRequestStateChangedMessagePayload value = QuoteRequestStateChangedMessagePayload.of();
        value.setOldQuoteRequestState(
            com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getOldQuoteRequestState())
                .isEqualTo(com.commercetools.api.models.quote_request.QuoteRequestState.findEnum("Submitted"));
    }
}
