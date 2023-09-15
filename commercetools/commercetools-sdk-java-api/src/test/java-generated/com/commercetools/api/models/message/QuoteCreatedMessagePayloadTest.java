
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
public class QuoteCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteCreatedMessagePayloadBuilder builder) {
        QuoteCreatedMessagePayload quoteCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteCreatedMessagePayload).isInstanceOf(QuoteCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                QuoteCreatedMessagePayload.builder().quote(new com.commercetools.api.models.quote.QuoteImpl()) } };
    }

    @Test
    public void quote() {
        QuoteCreatedMessagePayload value = QuoteCreatedMessagePayload.of();
        value.setQuote(new com.commercetools.api.models.quote.QuoteImpl());
        Assertions.assertThat(value.getQuote()).isEqualTo(new com.commercetools.api.models.quote.QuoteImpl());
    }
}
