
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
public class StagedQuoteCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteCreatedMessagePayloadBuilder builder) {
        StagedQuoteCreatedMessagePayload stagedQuoteCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteCreatedMessagePayload).isInstanceOf(StagedQuoteCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedQuoteCreatedMessagePayload.builder()
                .stagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteImpl()) } };
    }

    @Test
    public void stagedQuote() {
        StagedQuoteCreatedMessagePayload value = StagedQuoteCreatedMessagePayload.of();
        value.setStagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
        Assertions.assertThat(value.getStagedQuote())
                .isEqualTo(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
    }
}
