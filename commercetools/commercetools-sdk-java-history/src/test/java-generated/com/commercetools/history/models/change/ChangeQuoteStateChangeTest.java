
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
public class ChangeQuoteStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeQuoteStateChangeBuilder builder) {
        ChangeQuoteStateChange changeQuoteStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeQuoteStateChange).isInstanceOf(ChangeQuoteStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeQuoteStateChange.builder().change("change") },
                new Object[] { ChangeQuoteStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending")) },
                new Object[] { ChangeQuoteStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending")) } };
    }

    @Test
    public void change() {
        ChangeQuoteStateChange value = ChangeQuoteStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeQuoteStateChange value = ChangeQuoteStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
    }

    @Test
    public void nextValue() {
        ChangeQuoteStateChange value = ChangeQuoteStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
    }
}
