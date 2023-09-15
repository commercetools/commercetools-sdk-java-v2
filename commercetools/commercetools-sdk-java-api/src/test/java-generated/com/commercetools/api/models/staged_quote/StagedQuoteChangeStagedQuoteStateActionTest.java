
package com.commercetools.api.models.staged_quote;

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
public class StagedQuoteChangeStagedQuoteStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteChangeStagedQuoteStateActionBuilder builder) {
        StagedQuoteChangeStagedQuoteStateAction stagedQuoteChangeStagedQuoteStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteChangeStagedQuoteStateAction)
                .isInstanceOf(StagedQuoteChangeStagedQuoteStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedQuoteChangeStagedQuoteStateAction.builder()
                .stagedQuoteState(
                    com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress")) } };
    }

    @Test
    public void stagedQuoteState() {
        StagedQuoteChangeStagedQuoteStateAction value = StagedQuoteChangeStagedQuoteStateAction.of();
        value.setStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }
}
