
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
public class RequestQuoteRenegotiationChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(RequestQuoteRenegotiationChangeBuilder builder) {
        RequestQuoteRenegotiationChange requestQuoteRenegotiationChange = builder.buildUnchecked();
        Assertions.assertThat(requestQuoteRenegotiationChange).isInstanceOf(RequestQuoteRenegotiationChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { RequestQuoteRenegotiationChange.builder().change("change") },
                new Object[] { RequestQuoteRenegotiationChange.builder()
                        .previousValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending")) },
                new Object[] { RequestQuoteRenegotiationChange.builder()
                        .nextValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending")) },
                new Object[] { RequestQuoteRenegotiationChange.builder().buyerComment("buyerComment") } };
    }

    @Test
    public void change() {
        RequestQuoteRenegotiationChange value = RequestQuoteRenegotiationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RequestQuoteRenegotiationChange value = RequestQuoteRenegotiationChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
    }

    @Test
    public void nextValue() {
        RequestQuoteRenegotiationChange value = RequestQuoteRenegotiationChange.of();
        value.setNextValue(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.QuoteState.findEnum("Pending"));
    }

    @Test
    public void buyerComment() {
        RequestQuoteRenegotiationChange value = RequestQuoteRenegotiationChange.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }
}
