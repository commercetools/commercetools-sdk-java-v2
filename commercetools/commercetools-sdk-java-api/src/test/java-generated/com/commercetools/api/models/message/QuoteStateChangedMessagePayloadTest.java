
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
public class QuoteStateChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteStateChangedMessagePayloadBuilder builder) {
        QuoteStateChangedMessagePayload quoteStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteStateChangedMessagePayload).isInstanceOf(QuoteStateChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { QuoteStateChangedMessagePayload.builder()
                        .quoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending")) },
                new Object[] { QuoteStateChangedMessagePayload.builder()
                        .oldQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending")) } };
    }

    @Test
    public void quoteState() {
        QuoteStateChangedMessagePayload value = QuoteStateChangedMessagePayload.of();
        value.setQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getQuoteState())
                .isEqualTo(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
    }

    @Test
    public void oldQuoteState() {
        QuoteStateChangedMessagePayload value = QuoteStateChangedMessagePayload.of();
        value.setOldQuoteState(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getOldQuoteState())
                .isEqualTo(com.commercetools.api.models.quote.QuoteState.findEnum("Pending"));
    }
}
