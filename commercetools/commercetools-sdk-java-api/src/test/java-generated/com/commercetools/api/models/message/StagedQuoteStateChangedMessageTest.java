
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
public class StagedQuoteStateChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteStateChangedMessageBuilder builder) {
        StagedQuoteStateChangedMessage stagedQuoteStateChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteStateChangedMessage).isInstanceOf(StagedQuoteStateChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedQuoteStateChangedMessage.builder()
                                .stagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState
                                        .findEnum("InProgress")) },
                new Object[] { StagedQuoteStateChangedMessage.builder()
                        .oldStagedQuoteState(
                            com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress")) } };
    }

    @Test
    public void stagedQuoteState() {
        StagedQuoteStateChangedMessage value = StagedQuoteStateChangedMessage.of();
        value.setStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }

    @Test
    public void oldStagedQuoteState() {
        StagedQuoteStateChangedMessage value = StagedQuoteStateChangedMessage.of();
        value.setOldStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getOldStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }
}
