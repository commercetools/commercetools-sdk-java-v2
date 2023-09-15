
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
public class StagedQuoteStateChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteStateChangedMessagePayloadBuilder builder) {
        StagedQuoteStateChangedMessagePayload stagedQuoteStateChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteStateChangedMessagePayload)
                .isInstanceOf(StagedQuoteStateChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        StagedQuoteStateChangedMessagePayload.builder()
                                .stagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState
                                        .findEnum("InProgress")) },
                new Object[] { StagedQuoteStateChangedMessagePayload.builder()
                        .oldStagedQuoteState(
                            com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress")) } };
    }

    @Test
    public void stagedQuoteState() {
        StagedQuoteStateChangedMessagePayload value = StagedQuoteStateChangedMessagePayload.of();
        value.setStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }

    @Test
    public void oldStagedQuoteState() {
        StagedQuoteStateChangedMessagePayload value = StagedQuoteStateChangedMessagePayload.of();
        value.setOldStagedQuoteState(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getOldStagedQuoteState())
                .isEqualTo(com.commercetools.api.models.staged_quote.StagedQuoteState.findEnum("InProgress"));
    }
}
