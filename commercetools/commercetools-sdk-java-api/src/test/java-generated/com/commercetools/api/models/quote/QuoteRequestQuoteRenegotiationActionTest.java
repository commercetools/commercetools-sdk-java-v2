
package com.commercetools.api.models.quote;

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
public class QuoteRequestQuoteRenegotiationActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestQuoteRenegotiationActionBuilder builder) {
        QuoteRequestQuoteRenegotiationAction quoteRequestQuoteRenegotiationAction = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestQuoteRenegotiationAction)
                .isInstanceOf(QuoteRequestQuoteRenegotiationAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { QuoteRequestQuoteRenegotiationAction.builder().buyerComment("buyerComment") } };
    }

    @Test
    public void buyerComment() {
        QuoteRequestQuoteRenegotiationAction value = QuoteRequestQuoteRenegotiationAction.of();
        value.setBuyerComment("buyerComment");
        Assertions.assertThat(value.getBuyerComment()).isEqualTo("buyerComment");
    }
}
