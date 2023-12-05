
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
public class StagedQuoteCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteCreatedMessageBuilder builder) {
        StagedQuoteCreatedMessage stagedQuoteCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteCreatedMessage).isInstanceOf(StagedQuoteCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedQuoteCreatedMessage.builder()
                .stagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteImpl()) } };
    }

    @Test
    public void stagedQuote() {
        StagedQuoteCreatedMessage value = StagedQuoteCreatedMessage.of();
        value.setStagedQuote(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
        Assertions.assertThat(value.getStagedQuote())
                .isEqualTo(new com.commercetools.api.models.staged_quote.StagedQuoteImpl());
    }
}
