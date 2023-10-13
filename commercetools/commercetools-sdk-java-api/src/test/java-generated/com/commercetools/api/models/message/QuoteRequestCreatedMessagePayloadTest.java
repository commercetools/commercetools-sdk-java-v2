
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
public class QuoteRequestCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestCreatedMessagePayloadBuilder builder) {
        QuoteRequestCreatedMessagePayload quoteRequestCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestCreatedMessagePayload).isInstanceOf(QuoteRequestCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { QuoteRequestCreatedMessagePayload.builder()
                .quoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestImpl()) } };
    }

    @Test
    public void quoteRequest() {
        QuoteRequestCreatedMessagePayload value = QuoteRequestCreatedMessagePayload.of();
        value.setQuoteRequest(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
        Assertions.assertThat(value.getQuoteRequest())
                .isEqualTo(new com.commercetools.api.models.quote_request.QuoteRequestImpl());
    }
}
