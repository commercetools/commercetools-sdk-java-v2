
package com.commercetools.history.models.change;

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
public class ChangeStagedQuoteStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeStagedQuoteStateChangeBuilder builder) {
        ChangeStagedQuoteStateChange changeStagedQuoteStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeStagedQuoteStateChange).isInstanceOf(ChangeStagedQuoteStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeStagedQuoteStateChange.builder().change("change") },
                new Object[] { ChangeStagedQuoteStateChange.builder()
                        .previousValue(
                            com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress")) },
                new Object[] { ChangeStagedQuoteStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress")) } };
    }

    @Test
    public void change() {
        ChangeStagedQuoteStateChange value = ChangeStagedQuoteStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeStagedQuoteStateChange value = ChangeStagedQuoteStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress"));
    }

    @Test
    public void nextValue() {
        ChangeStagedQuoteStateChange value = ChangeStagedQuoteStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.StagedQuoteState.findEnum("InProgress"));
    }
}
