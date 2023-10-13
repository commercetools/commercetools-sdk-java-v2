
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
public class ChangeQuoteRequestStateChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeQuoteRequestStateChangeBuilder builder) {
        ChangeQuoteRequestStateChange changeQuoteRequestStateChange = builder.buildUnchecked();
        Assertions.assertThat(changeQuoteRequestStateChange).isInstanceOf(ChangeQuoteRequestStateChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeQuoteRequestStateChange.builder().change("change") },
                new Object[] { ChangeQuoteRequestStateChange.builder()
                        .previousValue(
                            com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted")) },
                new Object[] { ChangeQuoteRequestStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted")) } };
    }

    @Test
    public void change() {
        ChangeQuoteRequestStateChange value = ChangeQuoteRequestStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeQuoteRequestStateChange value = ChangeQuoteRequestStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted"));
    }

    @Test
    public void nextValue() {
        ChangeQuoteRequestStateChange value = ChangeQuoteRequestStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteRequestState.findEnum("Submitted"));
    }
}
